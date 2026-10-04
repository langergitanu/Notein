package oO00Oo;

import Oooo0oO.C21111o0ooOoO;
import java.util.LinkedHashMap;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: oO00Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32251OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final short f115832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f115833OooO0O0;

    /* JADX INFO: renamed from: oO00Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public enum EnumC20210OooO00o {
        /* JADX INFO: Fake field, exist only in values array */
        NORMAL(1000),
        /* JADX INFO: Fake field, exist only in values array */
        GOING_AWAY(1001),
        PROTOCOL_ERROR(1002),
        /* JADX INFO: Fake field, exist only in values array */
        CANNOT_ACCEPT(1003),
        /* JADX INFO: Fake field, exist only in values array */
        CLOSED_ABNORMALLY(1006),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_CONSISTENT(1007),
        /* JADX INFO: Fake field, exist only in values array */
        VIOLATED_POLICY(1008),
        TOO_BIG(1009),
        /* JADX INFO: Fake field, exist only in values array */
        NO_EXTENSION(1010),
        /* JADX INFO: Fake field, exist only in values array */
        INTERNAL_ERROR(1011),
        /* JADX INFO: Fake field, exist only in values array */
        SERVICE_RESTART(1012),
        /* JADX INFO: Fake field, exist only in values array */
        TRY_AGAIN_LATER(1013);


        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final LinkedHashMap f115834OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final short f115838OooOo0o;

        static {
            EnumC20210OooO00o[] enumC20210OooO00oArrValues = values();
            int iOooO0Oo = Oooo0.OooO0Oo(enumC20210OooO00oArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo < 16 ? 16 : iOooO0Oo);
            for (EnumC20210OooO00o enumC20210OooO00o : enumC20210OooO00oArrValues) {
                linkedHashMap.put(Short.valueOf(enumC20210OooO00o.f115838OooOo0o), enumC20210OooO00o);
            }
            f115834OooOo = linkedHashMap;
        }

        EnumC20210OooO00o(short s) {
            this.f115838OooOo0o = s;
        }
    }

    public C32251OooO00o(EnumC20210OooO00o enumC20210OooO00o, String message) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        short s = enumC20210OooO00o.f115838OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        this.f115832OooO00o = s;
        this.f115833OooO0O0 = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32251OooO00o)) {
            return false;
        }
        C32251OooO00o c32251OooO00o = (C32251OooO00o) obj;
        return this.f115832OooO00o == c32251OooO00o.f115832OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115833OooO0O0, c32251OooO00o.f115833OooO0O0);
    }

    public final int hashCode() {
        return this.f115833OooO0O0.hashCode() + (Short.hashCode(this.f115832OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseReason(reason=");
        LinkedHashMap linkedHashMap = EnumC20210OooO00o.f115834OooOo;
        LinkedHashMap linkedHashMap2 = EnumC20210OooO00o.f115834OooOo;
        short s = this.f115832OooO00o;
        Object objValueOf = (EnumC20210OooO00o) linkedHashMap2.get(Short.valueOf(s));
        if (objValueOf == null) {
            objValueOf = Short.valueOf(s);
        }
        sb.append(objValueOf);
        sb.append(", message=");
        return C21111o0ooOoO.OooO0OO(this.f115833OooO0O0, ')', sb);
    }
}
