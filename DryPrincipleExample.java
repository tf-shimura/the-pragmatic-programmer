public class DryPrincipleExample {

    // 金額をフォーマットするメソッド（未使用）
    public static String formatAmount(double amount) {
        if (amount < 0) {
            return "- " + amount;
        } else {
            return String.valueOf(amount);
        }
    }

    public static void printBalance(Account account) {
        System.out.println("引き落とし: " + account.debits);
        System.out.println("預金: " + account.credits);
        
        if (account.fees < 0) {
            System.out.println("手数料: -" + account.fees);
        } else {
            System.out.println("手数料: " + account.fees);
        }

        System.out.println("----------------");

        if (account.balance < 0) {
            System.out.println("残高: -" + account.balance);
        } else {
            System.out.println("残高: " + account.balance);
        }
    }

    public static void main(String[] args) {
        Account sampleAccount = new Account(1000, 500, 100, 400);
        printBalance(sampleAccount);
    }
}

// アカウント情報を保持するクラス
class Account {
    double debits;
    double credits;
    double fees;
    double balance;

    public Account(double debits, double credits, double fees, double balance) {
        this.debits = debits;
        this.credits = credits;
        this.fees = fees;
        this.balance = balance;
    }
}
