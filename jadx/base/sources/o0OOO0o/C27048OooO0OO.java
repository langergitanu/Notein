package o0OOO0o;

import OooO0Oo.C20398OooO0O0;
import OoooooO.C21409OooO0Oo;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOO0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C27048OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<OooO0O0, WeakReference<OooO00o>> f94176OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: o0OOO0o.OooO0OO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C21409OooO0Oo f94177OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f94178OooO0O0;

        public OooO00o(C21409OooO0Oo c21409OooO0Oo, int i) {
            this.f94177OooO00o = c21409OooO0Oo;
            this.f94178OooO0O0 = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f94177OooO00o, oooO00o.f94177OooO00o) && this.f94178OooO0O0 == oooO00o.f94178OooO0O0;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f94178OooO0O0) + (this.f94177OooO00o.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.f94177OooO00o);
            sb.append(", configFlags=");
            return C20398OooO0O0.OooO00o(')', sb, this.f94178OooO0O0);
        }
    }

    /* JADX INFO: renamed from: o0OOO0o.OooO0OO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources.Theme f94179OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f94180OooO0O0;

        public OooO0O0(Resources.Theme theme, int i) {
            this.f94179OooO00o = theme;
            this.f94180OooO0O0 = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return OooOOO0.OooO0O0(this.f94179OooO00o, oooO0O0.f94179OooO00o) && this.f94180OooO0O0 == oooO0O0.f94180OooO0O0;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f94180OooO0O0) + (this.f94179OooO00o.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.f94179OooO00o);
            sb.append(", id=");
            return C20398OooO0O0.OooO00o(')', sb, this.f94180OooO0O0);
        }
    }
}
