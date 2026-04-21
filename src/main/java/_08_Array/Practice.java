package _08_Array;

public class Practice {
    public static void main(String[] args) {
        String[] products = {"마우스", "키보드", "헤드셋", "스피커"};

        // {제고, 가격}
        int[][] inventory = {
                {50, 29000}, // products[0]의 재고, 가격
                {30, 35000}, // products[1]의 재고, 가격
                {25, 45000}, // ..
                {40, 49000}
        };

        // 1. 재고가 35미만인 상품들의 이름을 출력하세요
        for (int i = 0; i < inventory.length; i++) {
            int[] information = inventory[i];
            int stock = information[0];
            if (stock < 35) {
                String productName = products[i];
                System.out.println(productName);
            }
        }
        // 2. inventory의 총 가치를 구해주세요
        int totalSum = 0;
        for (int i = 0; i < inventory.length; i++) {
            int[] information = inventory[i];
            int stock = information[0];
            int price = information[1];
            int totalPrice = stock * price;
            totalSum += totalPrice;
            }
        System.out.println("창고 총 가치: " + totalSum);

        // 3. target의 재고와 가격을 각각 출력
        String target = "헤드셋";

        int targetIdx = -1; // 인덱스는 >= 0 이기때문
        for (int i = 0; i < products.length; i++) {
            String productName = products[i];
            if (productName.equals(target)) {
                targetIdx = i;
                break;
            }
        }

        // 만약에 못 찾았다면(target이 없다면)
        if (targetIdx == -1) {
            System.out.println(target + "은 존재하지 않는 상품");
            return; // 메서드 즉시종료 -> main 즉시종료
        } // 얼리리턴 패턴

        System.out.println(target + "을 찾았습니다");
        int[] targetInfo = inventory[targetIdx];
        int stock = targetInfo[0];
        int price = targetInfo[1];
        System.out.println(target + "의 재고: " + stock);
        System.out.println(target + "의 가격: " + price);

    }
}

