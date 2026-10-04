package com.orion.notein.p607ui.login.password;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: com.orion.notein.ui.login.password.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19224OooO00o extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19224OooO00o f72471OooO00o = new C19224OooO00o();
    }

    public static final class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f72472OooO00o = new OooO0O0();
    }

    public static final class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f72473OooO00o;

        public OooO0OO(int i) {
            this.f72473OooO00o = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0OO) && this.f72473OooO00o == ((OooO0OO) obj).f72473OooO00o;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f72473OooO00o);
        }

        public final String toString() {
            return C21023OooO0Oo.OooO0OO(")", this.f72473OooO00o, new StringBuilder("TooManyAttempts(waitMinutes="));
        }
    }
}
