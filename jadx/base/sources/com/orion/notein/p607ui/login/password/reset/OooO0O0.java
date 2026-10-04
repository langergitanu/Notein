package com.orion.notein.p607ui.login.password.reset;

import Oooo0oO.C21023OooO0Oo;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0O0 {

    public static final class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f72518OooO00o = R.string.network_error;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO00o) && this.f72518OooO00o == ((OooO00o) obj).f72518OooO00o;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f72518OooO00o);
        }

        public final String toString() {
            return C21023OooO0Oo.OooO0OO(")", this.f72518OooO00o, new StringBuilder("ShowToast(messageResId="));
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.password.reset.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C19227OooO0O0 extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19227OooO0O0 f72519OooO00o = new C19227OooO0O0();
    }
}
