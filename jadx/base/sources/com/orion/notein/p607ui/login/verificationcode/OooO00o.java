package com.orion.notein.p607ui.login.verificationcode;

import Oooo0oO.C21023OooO0Oo;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19238OooO00o extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19238OooO00o f72621OooO00o = new C19238OooO00o();
    }

    public static final class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f72622OooO00o = new OooO0O0();
    }

    public static final class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f72623OooO00o = R.string.network_error;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0OO) && this.f72623OooO00o == ((OooO0OO) obj).f72623OooO00o;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f72623OooO00o);
        }

        public final String toString() {
            return C21023OooO0Oo.OooO0OO(")", this.f72623OooO00o, new StringBuilder("ShowToast(messageResId="));
        }
    }
}
