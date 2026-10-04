package o000Oo0;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C19620OooO0O0 f82897OooO00o = C19620OooO0O0.f82906OooO00o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f82898OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f82899OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f82900OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f82901OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f82902OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO00o f82903OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO00o f82904OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f82905OooOooO;

        /* JADX INFO: Fake field, exist only in values array */
        OooO00o EF0;

        static {
            OooO00o oooO00o = new OooO00o("PENALTY_LOG", 0);
            OooO00o oooO00o2 = new OooO00o("PENALTY_DEATH", 1);
            OooO00o oooO00o3 = new OooO00o("DETECT_FRAGMENT_REUSE", 2);
            f82899OooOo0o = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("DETECT_FRAGMENT_TAG_USAGE", 3);
            f82898OooOo = oooO00o4;
            OooO00o oooO00o5 = new OooO00o("DETECT_WRONG_NESTED_HIERARCHY", 4);
            f82901OooOoO0 = oooO00o5;
            OooO00o oooO00o6 = new OooO00o("DETECT_RETAIN_INSTANCE_USAGE", 5);
            f82900OooOoO = oooO00o6;
            OooO00o oooO00o7 = new OooO00o("DETECT_SET_USER_VISIBLE_HINT", 6);
            f82902OooOoOO = oooO00o7;
            OooO00o oooO00o8 = new OooO00o("DETECT_TARGET_FRAGMENT_USAGE", 7);
            f82904OooOoo0 = oooO00o8;
            OooO00o oooO00o9 = new OooO00o("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            f82903OooOoo = oooO00o9;
            f82905OooOooO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5, oooO00o6, oooO00o7, oooO00o8, oooO00o9};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f82905OooOooO.clone();
        }
    }

    /* JADX INFO: renamed from: o000Oo0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C19620OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19620OooO0O0 f82906OooO00o;

        static {
            C19620OooO0O0 c19620OooO0O0 = new C19620OooO0O0();
            new LinkedHashMap();
            f82906OooO00o = c19620OooO0O0;
        }
    }

    public static C19620OooO0O0 OooO00o(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                kotlin.jvm.internal.OooOOO0.OooO0o(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f82897OooO00o;
    }

    public static void OooO0O0(AbstractC24513OooOO0o abstractC24513OooOO0o) {
        if (FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(abstractC24513OooOO0o.f82907OooOo0o.getClass().getName()), abstractC24513OooOO0o);
        }
    }

    public static final void OooO0OO(Fragment fragment, String previousFragmentId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fragment, "fragment");
        kotlin.jvm.internal.OooOOO0.OooO0oO(previousFragmentId, "previousFragmentId");
        OooO0O0(new o000Oo0.OooO00o(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        OooO00o(fragment).getClass();
    }
}
