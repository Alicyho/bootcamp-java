public class DemoClassObject {
  public static void main(String[] args) {
    // Primitives, String, Array, if, loop
  
    // Tutor Phone Number 
    // Tutor Email Address
    // Tutor Wechat
    // Tutor Whatsapp

    // 使用無參數建構子 + setter 建立第一個導師物件
    Tutor t1 = new Tutor();
    t1.setEmailAddress("sallychan@gmail.com");
    t1.setPhoneNumber("+852 12345678");
    t1.setWechatId("sallychan");
    t1.setWhatsappNumber("+852 12345678");
    
    // 使用完整參數建構子建立第二個導師物件
    Tutor t2 = new Tutor("+852 87654321", "leolau@gmail.com", "leolau", "+852 87654321");
    
    // 使用 toString() 印出完整資訊
    System.out.println("=== Tutor 資訊 ===");
    System.out.println("t1: " + t1);
    System.out.println("t2: " + t2);
    System.out.println();
    
    // 使用 Getter 取得個別資訊
    String t2Email = t2.getEmailAddress();
    System.out.println("=== 個別資訊 ===");
    System.out.println("t2 的電子郵件: " + t2Email); // leolau@gmail.com
    System.out.println("t1 的電子郵件: " + t1.getEmailAddress()); // sallychan@gmail.com
    System.out.println("t1 的電話: " + t1.getPhoneNumber());
    System.out.println("t1 的微信: " + t1.getWechatId());
    System.out.println("t1 的 WhatsApp: " + t1.getWhatsappNumber());
    System.out.println();
    
    // 修改資訊（會自動驗證格式）
    System.out.println("=== 修改 t1 的電話號碼 ===");
    t1.setPhoneNumber("+852 99998888");
    System.out.println("修改後 t1 的電話: " + t1.getPhoneNumber());
    System.out.println("修改後 t1: " + t1);
    System.out.println();
    
    // 使用額外實用方法
    System.out.println("=== 額外功能 ===");
    System.out.println("t1 是否完整: " + t1.isComplete());
    System.out.println("t1 主要聯絡方式: " + t1.getPrimaryContact());
    System.out.println("t2 是否完整: " + t2.isComplete());
    System.out.println("t2 主要聯絡方式: " + t2.getPrimaryContact());
  }
}

/**
 * Tutor 類別 - 完整封裝版本
 * 符合物件導向設計原則
 */
class Tutor {
    // ===== 1. 私有欄位（封裝）=====
    private String phoneNumber;      // 電話號碼
    private String emailAddress;     // 電子郵件地址
    private String wechatId;         // 微信ID
    private String whatsappNumber;   // WhatsApp 號碼
    
    // ===== 2. 建構子（提供多種初始化方式）=====
    
    /**
     * 無參數建構子（預設）
     */
    public Tutor() {
        this.phoneNumber = "";
        this.emailAddress = "";
        this.wechatId = "";
        this.whatsappNumber = "";
    }
    
    /**
     * 完整參數建構子（一次設定所有欄位）
     */
    public Tutor(String phoneNumber, String emailAddress, String wechatId, String whatsappNumber) {
        setPhoneNumber(phoneNumber);
        setEmailAddress(emailAddress);
        setWechatId(wechatId);
        setWhatsappNumber(whatsappNumber);
    }
    
    /**
     * 簡化建構子（只設定必要欄位）
     */
    public Tutor(String phoneNumber, String emailAddress) {
        this(phoneNumber, emailAddress, "", "");
    }
    
    // ===== 3. Getter 和 Setter（控制存取）=====
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("電話號碼不能為空");
        }
        if (!phoneNumber.matches("\\+852 \\d{8}")) {
            throw new IllegalArgumentException("電話號碼格式錯誤，正確格式：+852 12345678");
        }
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        if (emailAddress == null || !emailAddress.contains("@") || !emailAddress.contains(".")) {
            throw new IllegalArgumentException("電子郵件格式錯誤，必須包含 @ 和 .");
        }
        this.emailAddress = emailAddress;
    }
    
    public String getWechatId() {
        return wechatId;
    }
    
    public void setWechatId(String wechatId) {
        this.wechatId = (wechatId == null) ? "" : wechatId;
    }
    
    public String getWhatsappNumber() {
        return whatsappNumber;
    }
    
    public void setWhatsappNumber(String whatsappNumber) {
        if (whatsappNumber == null || whatsappNumber.trim().isEmpty()) {
            this.whatsappNumber = "";
        } else if (!whatsappNumber.matches("\\+852 \\d{8}")) {
            throw new IllegalArgumentException("WhatsApp 號碼格式錯誤，正確格式：+852 12345678");
        } else {
            this.whatsappNumber = whatsappNumber;
        }
    }
    
    // ===== 4. toString() 方法（除錯用）=====
    @Override
    public String toString() {
        return String.format(
            "Tutor{電話='%s', 電子郵件='%s', 微信='%s', WhatsApp='%s'}",
            (phoneNumber != null && !phoneNumber.isEmpty()) ? phoneNumber : "未設定",
            (emailAddress != null && !emailAddress.isEmpty()) ? emailAddress : "未設定",
            (wechatId != null && !wechatId.isEmpty()) ? wechatId : "未設定",
            (whatsappNumber != null && !whatsappNumber.isEmpty()) ? whatsappNumber : "未設定"
        );
    }
    
    // ===== 5. 額外實用方法 =====
    
    /**
     * 檢查是否已設定所有聯絡方式
     */
    public boolean isComplete() {
        return phoneNumber != null && !phoneNumber.isEmpty() &&
               emailAddress != null && !emailAddress.isEmpty();
    }
    
    /**
     * 取得主要聯絡方式（優先順序：電話 > Email）
     */
    public String getPrimaryContact() {
        if (phoneNumber != null && !phoneNumber.isEmpty()) {
            return "電話: " + phoneNumber;
        } else if (emailAddress != null && !emailAddress.isEmpty()) {
            return "Email: " + emailAddress;
        } else {
            return "無聯絡方式";
        }
    }
}