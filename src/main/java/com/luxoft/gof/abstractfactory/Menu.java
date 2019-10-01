package com.luxoft.gof.abstractfactory;

import java.util.function.Supplier;

/**
 * Created by Teacher1316 on 6/5/2018.
 */
public class Menu {
    private Supplier<First> firstSupplier;
    private Supplier<Second> secondSupplier;

    public Menu(Supplier<First> firstSupplier, Supplier<Second> secondSupplier) {
        this.firstSupplier = firstSupplier;
        this.secondSupplier = secondSupplier;
    }

    public First createFirst() {
        return firstSupplier.get();
    }

    public Second createSecond() {
        return secondSupplier.get();
    }

    public void setFirstSupplier(Supplier<First> firstSupplier) {
        this.firstSupplier = firstSupplier;
    }

    public static void main(String[] args) {
        class FirstImpl implements First {
            @Override
            public String toString() {
                return "first impl";
            }
        }
        class FirstImpl2 implements First {
            @Override
            public String toString() {
                return "first impl2";
            }
        }
        class SecondImpl implements Second {
            @Override
            public String toString() {
                return "second impl";
            }
        }

        Menu menu = new Menu(FirstImpl::new, SecondImpl::new);
        System.out.println(menu.createFirst());
        System.out.println(menu.createSecond());

        menu.setFirstSupplier(FirstImpl2::new);

        System.out.println(menu.createFirst());
        System.out.println(menu.createSecond());
    }
}
