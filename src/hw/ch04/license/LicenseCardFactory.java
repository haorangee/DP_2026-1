package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100; // 면허번호 카운터 (100부터 시작)
    private String baseDate; // 발급 기준 날짜

    // 생성자: LicenseCardFactory(String baseDate)
    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    // createProduct(): LicenseCard 생성 (licenseCounter 증가)
    protected Product createProduct(String holder) {
        // baseDate 기준으로 expiryDate 계산 (5년 후)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate issuedLocalDate = LocalDate.parse(baseDate, formatter);
        LocalDate expiryLocalDate = issuedLocalDate.plusYears(5);
        String expiryDate = expiryLocalDate.format(formatter);

        return new LicenseCard(holder, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    // 등록 메시지 출력
    protected void registerProduct(Product product) {
        System.out.println(((LicenseCard) product).getHolder() + "의 운전면허증을 등록했습니다.");
    }
}
