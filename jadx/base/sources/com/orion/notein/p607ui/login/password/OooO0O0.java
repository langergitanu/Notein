package com.orion.notein.p607ui.login.password;

import com.google.firebase.firestore.util.OooOOO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0O0 {

    public static final class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f72474OooO00o = new OooO00o();
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.password.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C19225OooO0O0 extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f72475OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<String> f72476OooO0O0;

        public C19225OooO0O0(int i, List<String> list) {
            this.f72475OooO00o = i;
            this.f72476OooO0O0 = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19225OooO0O0)) {
                return false;
            }
            C19225OooO0O0 c19225OooO0O0 = (C19225OooO0O0) obj;
            return this.f72475OooO00o == c19225OooO0O0.f72475OooO00o && OooOOO0.OooO0O0(this.f72476OooO0O0, c19225OooO0O0.f72476OooO0O0);
        }

        public final int hashCode() {
            return this.f72476OooO0O0.hashCode() + (Integer.hashCode(this.f72475OooO00o) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowToast(messageResId=");
            sb.append(this.f72475OooO00o);
            sb.append(", formatArgs=");
            return OooOOO.OooO0O0(")", sb, this.f72476OooO0O0);
        }
    }
}
