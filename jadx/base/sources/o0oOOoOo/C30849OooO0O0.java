package o0oOOoOo;

import Oooo0oO.C21023OooO0Oo;
import androidx.lifecycle.AbstractC22019Ooooooo;
import com.orion.notein.global.R;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0OO00o0.C26577o000oo0O;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOOO;

/* JADX INFO: renamed from: o0oOOoOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m80612d2 = {"Lo0oOOoOo/OooO0O0;", "Landroidx/lifecycle/Ooooooo;", "OooO0OO", "OooO00o", "OooO0o0", "OooO0Oo", "OooO0O0", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30849OooO0O0 extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final List<OooO00o> f110256OooO0o = C34429OooOOo0.OooOO0o(new OooO00o(R.string.close, "none"), new OooO00o(R.string.xiaomi_slide_page_mode, "page"), new OooO00o(R.string.xiaomi_slide_pen_width_mode, "pen_width"));

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final List<OooO00o> f110257OooO0oO = C34429OooOOo0.OooOO0o(new OooO00o(R.string.close, "none"), new OooO00o(R.string.xiaomi_slide_page_mode, "page"), new OooO00o(R.string.xiaomi_slide_pen_width_mode, "pen_width"));

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Set<o0O0o000.OooO0O0> f110258OooO0oo = OooOOO.OoooOo0(new o0O0o000.OooO0O0[]{o0O0o000.OooO0O0.f88805OooOoO0, o0O0o000.OooO0O0.f88804OooOoO, o0O0o000.OooO0O0.f88803OooOo, o0O0o000.OooO0O0.f88809OooOooO, o0O0o000.OooO0O0.f88807OooOoo, o0O0o000.OooO0O0.f88808OooOoo0, o0O0o000.OooO0O0.f88806OooOoOO});

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C26577o000oo0O f110259OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<OooO0OO> f110260OooO0o0 = C34429OooOOo0.OooOO0o(new OooO0OO(R.string.close, 0), new OooO0OO(R.string.pen_key_switch_brushes, 1), new OooO0OO(R.string.pen_key_switch_tool, 7), new OooO0OO(R.string.pen_key_switch_color, 2), new OooO0OO(R.string.pen_key_switch_strokes_thickness, 3), new OooO0OO(R.string.pen_key_switch_to_eraser, 4), new OooO0OO(R.string.pen_key_switch_to_lasso, 5), new OooO0OO(R.string.pen_key_undo, 6));

    /* JADX INFO: renamed from: o0oOOoOo.OooO0O0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f110261OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f110262OooO0O0;

        public OooO00o(int i, String str) {
            this.f110261OooO00o = i;
            this.f110262OooO0O0 = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f110261OooO00o == oooO00o.f110261OooO00o && this.f110262OooO0O0.equals(oooO00o.f110262OooO0O0);
        }

        public final int hashCode() {
            return this.f110262OooO0O0.hashCode() + (Integer.hashCode(this.f110261OooO00o) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GestureOptionDefinition(nameResId=");
            sb.append(this.f110261OooO00o);
            sb.append(", value=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110262OooO0O0, ")");
        }
    }

    /* JADX INFO: renamed from: o0oOOoOo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20134OooO0O0 implements OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f110263OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f110264OooO0O0;

        public C20134OooO0O0(int i, String preferenceName) {
            OooOOO0.OooO0oO(preferenceName, "preferenceName");
            this.f110263OooO00o = i;
            this.f110264OooO0O0 = preferenceName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20134OooO0O0)) {
                return false;
            }
            C20134OooO0O0 c20134OooO0O0 = (C20134OooO0O0) obj;
            return this.f110263OooO00o == c20134OooO0O0.f110263OooO00o && OooOOO0.OooO0O0(this.f110264OooO0O0, c20134OooO0O0.f110264OooO0O0);
        }

        public final int hashCode() {
            return this.f110264OooO0O0.hashCode() + (Integer.hashCode(this.f110263OooO00o) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GestureShortcutSectionDefinition(titleRes=");
            sb.append(this.f110263OooO00o);
            sb.append(", preferenceName=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110264OooO0O0, ")");
        }
    }

    /* JADX INFO: renamed from: o0oOOoOo.OooO0O0$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f110265OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f110266OooO0O0;

        public OooO0OO(int i, int i2) {
            this.f110265OooO00o = i;
            this.f110266OooO0O0 = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f110265OooO00o == oooO0OO.f110265OooO00o && this.f110266OooO0O0 == oooO0OO.f110266OooO0O0;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f110266OooO0O0) + (Integer.hashCode(this.f110265OooO00o) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PenOptionDefinition(nameResId=");
            sb.append(this.f110265OooO00o);
            sb.append(", value=");
            return C21023OooO0Oo.OooO0OO(")", this.f110266OooO0O0, sb);
        }
    }

    /* JADX INFO: renamed from: o0oOOoOo.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C30850OooO0Oo implements OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f110267OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AbstractC24338OooO0o0.OooO00o<Integer> f110268OooO0O0;

        public C30850OooO0Oo(int i, AbstractC24338OooO0o0.OooO00o<Integer> preferenceKey) {
            OooOOO0.OooO0oO(preferenceKey, "preferenceKey");
            this.f110267OooO00o = i;
            this.f110268OooO0O0 = preferenceKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30850OooO0Oo)) {
                return false;
            }
            C30850OooO0Oo c30850OooO0Oo = (C30850OooO0Oo) obj;
            return this.f110267OooO00o == c30850OooO0Oo.f110267OooO00o && OooOOO0.OooO0O0(this.f110268OooO0O0, c30850OooO0Oo.f110268OooO0O0);
        }

        public final int hashCode() {
            return this.f110268OooO0O0.f81922OooO00o.hashCode() + (Integer.hashCode(this.f110267OooO00o) * 31);
        }

        public final String toString() {
            return "PenShortcutSectionDefinition(titleRes=" + this.f110267OooO00o + ", preferenceKey=" + this.f110268OooO0O0 + ")";
        }
    }

    /* JADX INFO: renamed from: o0oOOoOo.OooO0O0$OooO0o0 */
    public interface OooO0o0 {
    }

    public C30849OooO0O0(C26577o000oo0O c26577o000oo0O) {
        this.f110259OooO0Oo = c26577o000oo0O;
    }
}
