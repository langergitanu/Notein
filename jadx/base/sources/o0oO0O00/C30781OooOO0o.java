package o0oO0O00;

import androidx.lifecycle.AbstractC22019Ooooooo;
import com.orion.notein.global.R;
import kotlin.Metadata;
import o0O0ooo0.EnumC26248OooOo0;
import o0OOOO0o.C27129OoooOOO;
import oO0o0O0o.C33588OooOO0;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;

/* JADX INFO: renamed from: o0oO0O00.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0oO0O00/OooOO0o;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30781OooOO0o extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final C33588OooOO0 f110057OooO = new C33588OooOO0("^(?=.{8,14}$)(?:(?=.*[A-Za-z])(?=.*\\d)|(?=.*[A-Za-z])(?=.*[!@,.:;\\\"'/#\\$%&*()_+=|<>?{}\\[\\]~\\-])|(?=.*\\d)(?=.*[!@,.:;\\\"'/#\\$%&*()_+=|<>?{}\\[\\]~\\-]))[A-Za-z\\d!@,.:;\\\"'/#\\$%&*()_+=|<>?{}\\[\\]~\\-]+$");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27129OoooOOO f110058OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33781o00o0O f110059OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33781o00o0O f110060OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33772OooooOo f110061OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33772OooooOo f110062OooO0oo;

    /* JADX INFO: renamed from: o0oO0O00.OooOO0o$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f110063OooO00o;

        static {
            int[] iArr = new int[EnumC30775OooO0o.values().length];
            try {
                EnumC30775OooO0o enumC30775OooO0o = EnumC30775OooO0o.f110045OooOo0o;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f110063OooO00o = iArr;
        }
    }

    public C30781OooOO0o(C27129OoooOOO c27129OoooOOO) {
        this.f110058OooO0Oo = c27129OoooOOO;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(new C30780OooOO0O(0));
        this.f110060OooO0o0 = c33781o00o0OOooO00o;
        this.f110059OooO0o = c33781o00o0OOooO00o;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 1, 5);
        this.f110061OooO0oO = c33772OooooOoOooO0O0;
        this.f110062OooO0oo = c33772OooooOoOooO0O0;
    }

    public final boolean OooO0o0() {
        Object value;
        C30780OooOO0O c30780OooOO0O;
        int i;
        C33781o00o0O c33781o00o0O = this.f110060OooO0o0;
        boolean zOooO0O0 = f110057OooO.OooO0O0(((C30780OooOO0O) c33781o00o0O.getValue()).f110051OooO00o);
        if (!zOooO0O0) {
            do {
                value = c33781o00o0O.getValue();
                c30780OooOO0O = (C30780OooOO0O) value;
                i = OooO00o.f110063OooO00o[c30780OooOO0O.f110055OooO0o.ordinal()] == 1 ? R.string.input_original_password_tip : R.string.password_hint;
            } while (!c33781o00o0O.OooO(value, C30780OooOO0O.OooO00o(c30780OooOO0O, null, c30780OooOO0O.f110051OooO00o.length() > 0 && !c30780OooOO0O.f110053OooO0OO, false, EnumC26248OooOo0.f89696OooOoO0, Integer.valueOf(i), 37)));
        }
        return zOooO0O0;
    }
}
