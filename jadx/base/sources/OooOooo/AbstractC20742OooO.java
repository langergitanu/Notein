package OooOooo;

import OoooOoO.C21230OooO0O0;
import OoooOoO.InterfaceC21229OooO00o;
import o0000Ooo.EnumC24238OooOOO;
import oo000o.AbstractC34655Oooo0o;

/* JADX INFO: renamed from: OooOooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20742OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f59592OooO00o = 0;

    /* JADX INFO: renamed from: OooOooo.OooO$OooO00o */
    public static final class OooO00o extends AbstractC20742OooO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int f59593OooO0O0 = 0;

        static {
            new OooO00o();
        }

        @Override // OooOooo.AbstractC20742OooO
        public final int OooO00o(int i, EnumC24238OooOOO enumC24238OooOOO, AbstractC34655Oooo0o abstractC34655Oooo0o) {
            return i / 2;
        }
    }

    /* JADX INFO: renamed from: OooOooo.OooO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC20742OooO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int f59594OooO0O0 = 0;

        static {
            new OooO0O0();
        }

        @Override // OooOooo.AbstractC20742OooO
        public final int OooO00o(int i, EnumC24238OooOOO enumC24238OooOOO, AbstractC34655Oooo0o abstractC34655Oooo0o) {
            if (enumC24238OooOOO == EnumC24238OooOOO.f81494OooOo0o) {
                return i;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: OooOooo.OooO$OooO0OO */
    public static final class OooO0OO extends AbstractC20742OooO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C21230OooO0O0.OooO00o f59595OooO0O0 = InterfaceC21229OooO00o.C18984OooO00o.f61591OooO0o;

        @Override // OooOooo.AbstractC20742OooO
        public final int OooO00o(int i, EnumC24238OooOOO enumC24238OooOOO, AbstractC34655Oooo0o abstractC34655Oooo0o) {
            return this.f59595OooO0O0.OooO00o(i, enumC24238OooOOO);
        }
    }

    /* JADX INFO: renamed from: OooOooo.OooO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C20743OooO0Oo extends AbstractC20742OooO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int f59596OooO0O0 = 0;

        static {
            new C20743OooO0Oo();
        }

        @Override // OooOooo.AbstractC20742OooO
        public final int OooO00o(int i, EnumC24238OooOOO enumC24238OooOOO, AbstractC34655Oooo0o abstractC34655Oooo0o) {
            if (enumC24238OooOOO == EnumC24238OooOOO.f81494OooOo0o) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: OooOooo.OooO$OooO0o0, reason: case insensitive filesystem */
    public static final class C20744OooO0o0 extends AbstractC20742OooO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C21230OooO0O0.C18985OooO0O0 f59597OooO0O0;

        public C20744OooO0o0(C21230OooO0O0.C18985OooO0O0 vertical) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(vertical, "vertical");
            this.f59597OooO0O0 = vertical;
        }

        @Override // OooOooo.AbstractC20742OooO
        public final int OooO00o(int i, EnumC24238OooOOO enumC24238OooOOO, AbstractC34655Oooo0o abstractC34655Oooo0o) {
            return this.f59597OooO0O0.OooO00o(i);
        }
    }

    static {
        int i = OooO00o.f59593OooO0O0;
        int i2 = C20743OooO0Oo.f59596OooO0O0;
        int i3 = OooO0O0.f59594OooO0O0;
    }

    public abstract int OooO00o(int i, EnumC24238OooOOO enumC24238OooOOO, AbstractC34655Oooo0o abstractC34655Oooo0o);
}
