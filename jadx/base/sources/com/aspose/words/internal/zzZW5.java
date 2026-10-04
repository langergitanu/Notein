package com.aspose.words.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
class zzZW5 extends zzAD {
    private Class zz85;
    private boolean zz86;
    private boolean zz87;
    private boolean zz88;
    private String zzMy;

    public static class zzZ extends zzZW5 {
        public zzZ(zzZW5 zzzw5) {
            super(zzzw5);
        }

        @Override // com.aspose.words.internal.zzAD
        public final boolean zzAI() {
            return true;
        }
    }

    public zzZW5(zzZW5 zzzw5) {
        super(zzzw5);
        this.zzMy = zzzw5.zzMy;
        this.zz88 = zzzw5.zz88;
        this.zz87 = zzzw5.zz87;
        this.zz86 = zzzw5.zz86;
        this.zz85 = zzzw5.zz85;
    }

    private static int zzX(Class cls, Class cls2) {
        int i = 0;
        if (cls.isInterface()) {
            return 0;
        }
        while (cls != cls2) {
            i++;
            cls = cls.getSuperclass();
        }
        return i;
    }

    private static Class zzY(Member member, int i) {
        if (i == 1) {
            return member.getDeclaringClass();
        }
        if (i == 2) {
            return ((Method) member).getReturnType();
        }
        if (i == 6) {
            return ((Field) member).getType();
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: memberType");
    }

    private static zzZVP zzZ(Member member, int i) {
        return zzZVO.zzX(zzY(member, i), null, zzZZO.zzZ(member));
    }

    @Override // com.aspose.words.internal.zzAD
    public final boolean zzAD() {
        if (zzAG() != 3 || !zzAF().zznq()) {
            return false;
        }
        for (int i = 0; i < zzAE().length; i++) {
            if (!zzAE()[i].zznq()) {
                return false;
            }
        }
        return true;
    }

    public final int zznP() {
        return zzX(((zzZW6) zzAH()).getType(), this.zz85);
    }

    public final Class zznQ() {
        return this.zz85;
    }

    public final boolean zznR() {
        return this.zz86;
    }

    public final boolean zznS() {
        return this.zz87;
    }

    public final boolean zznT() {
        return this.zz88;
    }

    public final String zznU() {
        return this.zzMy;
    }

    public final zzZW5 zznV() {
        return new zzZ(this);
    }

    public final void zzZ(zzZW6 zzzw6) {
        zzZ((zzAF) zzzw6);
    }

    public zzZW5(Object obj, Member member, int i, zz6P[] zz6pArr) {
        super((zzAF) null, obj, i, zzZ(member, i), zz6pArr);
        this.zzMy = i == 1 ? null : member.getName();
        this.zz88 = zzZZO.zzY(member);
        this.zz87 = zzZZO.zzX(member);
        this.zz86 = zzZZO.zzW(member);
        this.zz85 = member.getDeclaringClass();
    }
}
