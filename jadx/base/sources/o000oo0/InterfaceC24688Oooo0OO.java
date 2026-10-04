package o000oo0;

import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o000oo0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC24688Oooo0OO extends OooOOOO {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o000oo0.Oooo0OO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f83658OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f83659OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f83660OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("DEFERRED", 0);
            f83659OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("IMMEDIATE", 1);
            f83658OooOo = oooO00o2;
            OooO00o[] oooO00oArr = {oooO00o, oooO00o2, new OooO00o("EXCLUSIVE", 2)};
            f83660OooOoO0 = oooO00oArr;
            OooO.OooO00o.OooO0O0(oooO00oArr);
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f83660OooOoO0.clone();
        }
    }

    Object OooO0OO(AbstractC32476OooO abstractC32476OooO);

    Object OooO0Oo(OooO00o oooO00o, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32476OooO abstractC32476OooO);
}
