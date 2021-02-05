package BridgePattern;

public interface Brand {
    public String printBrand();
}

class Lenovo implements Brand{
    @Override
    public String printBrand() {
        return "品牌：Lenovo";
    }
}

class OMEN implements Brand{
    @Override
    public String printBrand() {
        return "品牌：OMEN";
    }
}

class Huawei implements Brand{
    @Override
    public String printBrand() {
        return "品牌：Huawei";
    }
}


