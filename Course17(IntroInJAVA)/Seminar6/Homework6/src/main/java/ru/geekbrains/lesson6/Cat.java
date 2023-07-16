package ru.geekbrains.lesson6;

public class Cat {
    /**
     * Кол0во голов у одного кота
     */
    private Integer qtyOfHeads;

    /**
     * Кол-во лап у одного кота
     */
    private Integer qtyOfFeet;
    /**
     * Кол-во хвостов у одного кота
     */
    private Integer qtyOfTails;

    public Cat(Integer qtyOfHeads, Integer qtyOfFeet, Integer qtyOfTails) {
        this.qtyOfHeads = qtyOfHeads;
        this.qtyOfFeet = qtyOfFeet;
        this.qtyOfTails = qtyOfTails;
    }

    public Integer getQtyOfHeads() {
        return qtyOfHeads;
    }

    public void setQtyOfHeads(Integer qtyOfHeads) {
        this.qtyOfHeads = qtyOfHeads;
    }

    public Integer getQtyOfFeet() {
        return qtyOfFeet;
    }

    public void setQtyOfFeet(Integer qtyOfFeet) {
        this.qtyOfFeet = qtyOfFeet;
    }

    public Integer getQtyOfTails() {
        return qtyOfTails;
    }

    public void setQtyOfTails(Integer qtyOfTails) {
        this.qtyOfTails = qtyOfTails;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "qtyOfHeads=" + qtyOfHeads +
                ", qtyOfFeet=" + qtyOfFeet +
                ", qtyOfTails=" + qtyOfTails +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;

        if (!getQtyOfHeads().equals(cat.getQtyOfHeads())) return false;
        if (!getQtyOfFeet().equals(cat.getQtyOfFeet())) return false;
        return getQtyOfTails().equals(cat.getQtyOfTails());
    }

    @Override
    public int hashCode() {
        int result = getQtyOfHeads().hashCode();
        result = 31 * result + getQtyOfFeet().hashCode();
        result = 31 * result + getQtyOfTails().hashCode();
        return result;
    }
}
