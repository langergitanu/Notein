package oO0O;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.OooOOO0;
import oO0OOO.C32934OooO0o0;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC20235OooO00o f116740OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32934OooO0o0 f116741OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String[] f116742OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String[] f116743OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f116744OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String[] f116745OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f116746OooO0oO;

    /* JADX INFO: renamed from: oO0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public enum EnumC20235OooO00o {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final LinkedHashMap f116747OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f116755OooOo0o;

        static {
            EnumC20235OooO00o[] enumC20235OooO00oArrValues = values();
            int iOooO0Oo = Oooo0.OooO0Oo(enumC20235OooO00oArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo < 16 ? 16 : iOooO0Oo);
            for (EnumC20235OooO00o enumC20235OooO00o : enumC20235OooO00oArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC20235OooO00o.f116755OooOo0o), enumC20235OooO00o);
            }
            f116747OooOo = linkedHashMap;
        }

        EnumC20235OooO00o(int i) {
            this.f116755OooOo0o = i;
        }
    }

    public OooO00o(EnumC20235OooO00o kind, C32934OooO0o0 c32934OooO0o0, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        OooOOO0.OooO0oO(kind, "kind");
        this.f116740OooO00o = kind;
        this.f116741OooO0O0 = c32934OooO0o0;
        this.f116742OooO0OO = strArr;
        this.f116743OooO0Oo = strArr2;
        this.f116745OooO0o0 = strArr3;
        this.f116744OooO0o = str;
        this.f116746OooO0oO = i;
    }

    public final String toString() {
        return this.f116740OooO00o + " version=" + this.f116741OooO0O0;
    }
}
