package com.aspose.words.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZLW extends zzZLZ {
    static zzZLW zzZSj;
    zzZLW zzZSd;
    boolean zzZSe;
    String zzZSk;
    String zzZSl;
    Integer zzZSi = 1;
    Integer zzZSh = 1;
    Integer zzZSg = -1;
    Integer zzZSf = -1;
    Integer zzZSn = 1;
    Integer zzZSm = 1;

    public static class zzZ extends zzZLW {
        @Override // com.aspose.words.internal.zzZLW
        public final void zzZ(zzZLX zzzlx, zzZN3 zzzn3) {
        }

        @Override // com.aspose.words.internal.zzZLW
        public final zzZLW zzZ3(boolean z) throws Exception {
            return this;
        }

        @Override // com.aspose.words.internal.zzZLW
        public final zzZLW zzg0() {
            return this;
        }

        @Override // com.aspose.words.internal.zzZLW
        public final boolean zzZ(zzZLW zzzlw) {
            return zzzlw == this || zzzlw == zzZLW.zzZSj;
        }
    }

    public static zzZLW zzg2() {
        if (zzZSj == null) {
            zzZSj = new zzZ();
        }
        return zzZSj;
    }

    public final void zzP(Integer num) throws zzZMJ {
        String string;
        if (num.intValue() == Integer.MAX_VALUE) {
            string = "unbounded";
        } else {
            String str = this.zzZSk;
            string = str == null ? "0" : str.toString();
        }
        zzUr(string);
    }

    public final void zzQ(Integer num) throws zzZMJ {
        zzUs(num.toString());
    }

    public final void zzUr(String str) throws zzZMJ {
        if (str == null) {
            str = "unbounded";
        }
        if ("unbounded".equals(str)) {
            this.zzZSk = str;
            this.zzZSm = Integer.MAX_VALUE;
            return;
        }
        int i = Integer.parseInt(str);
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            throw new zzZMJ("MaxOccurs must be a non-negative integer");
        }
        this.zzZSm = numValueOf;
        this.zzZSk = numValueOf.toString();
        if (i == 0 && this.zzZSl == null) {
            this.zzZSn = 0;
        }
    }

    public final void zzUs(String str) throws zzZMJ {
        if (str == null) {
            this.zzZSn = 1;
            this.zzZSl = str;
            return;
        }
        int i = Integer.parseInt(str);
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            throw new zzZMJ("MinOccursString must be a non-negative number");
        }
        this.zzZSn = numValueOf;
        this.zzZSl = numValueOf.toString();
    }

    public final void zzY(zzZLW zzzlw) throws zzZMJ {
        if ("unbounded".equals(this.zzZSk)) {
            zzzlw.zzZSh = Integer.MAX_VALUE;
            zzzlw.zzZSm = Integer.MAX_VALUE;
        } else {
            Integer num = this.zzZSh;
            zzzlw.zzZSh = num;
            zzzlw.zzZSm = num;
        }
        if (this.zzZSm.intValue() == 0) {
            zzzlw.zzZSi = 0;
            zzzlw.zzZSn = 0;
        } else {
            Integer num2 = this.zzZSi;
            zzzlw.zzZSi = num2;
            zzzlw.zzZSn = num2;
        }
        String str = this.zzZSl;
        if (str != null) {
            zzzlw.zzUs(str);
        }
        String str2 = this.zzZSk;
        if (str2 != null) {
            zzzlw.zzUr(str2);
        }
    }

    public void zzZ(zzZLX zzzlx, zzZN3 zzzn3) {
    }

    public zzZLW zzZ3(boolean z) throws Exception {
        return zzZSj;
    }

    public final zzZLW zzfY() {
        try {
            Object objNewInstance = getClass().newInstance();
            for (Class<?> superclass = getClass(); superclass.getSuperclass() != null; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if (!Modifier.isFinal(modifiers) && !Modifier.isStatic(modifiers)) {
                        field.setAccessible(true);
                        try {
                            field.set(objNewInstance, field.get(this));
                        } catch (IllegalAccessException e) {
                            zzZHV.zzY(e);
                        }
                    }
                }
            }
            return (zzZLW) objNewInstance;
        } catch (Exception e2) {
            zzZHV.zzZ(e2);
            return this;
        }
    }

    public final boolean zzfZ() {
        return this.zzZSi.intValue() == 0 || this.zzZSi.intValue() == 0;
    }

    public zzZLW zzg0() {
        return zzfY();
    }

    public final void zzg1() {
        if (this.zzZSn.intValue() <= this.zzZSm.intValue() || (this.zzZSm.intValue() == 0 && this.zzZSl == null)) {
            if ("unbounded".equals(this.zzZSk)) {
                this.zzZSh = Integer.MAX_VALUE;
            } else {
                this.zzZSh = this.zzZSm;
            }
            if (this.zzZSh.intValue() == 0) {
                this.zzZSi = 0;
            } else {
                this.zzZSi = this.zzZSn;
            }
        }
    }

    public boolean zzZ(zzZLW zzzlw) {
        return false;
    }
}
