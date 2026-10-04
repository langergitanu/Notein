package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC21907Oooo;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC21979OooOOo0;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends AbstractC21907Oooo implements FragmentManager.OooOOOO {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f64904OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final FragmentManager f64905OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f64906OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f64907OooOo0o;

    /* JADX WARN: Illegal instructions before constructor call */
    public OooO00o(FragmentManager fragmentManager) {
        C21901OooOoO0 c21901OooOoO0Oooo0O0 = fragmentManager.Oooo0O0();
        AbstractC21900OooOoO<?> abstractC21900OooOoO = fragmentManager.f64816OooOo;
        super(c21901OooOoO0Oooo0O0, abstractC21900OooOoO != null ? abstractC21900OooOoO.f64990OooOo.getClassLoader() : null);
        this.f64906OooOo0O = -1;
        this.f64907OooOo0o = false;
        this.f64905OooOo00 = fragmentManager;
    }

    public final int OooO(boolean z, boolean z2) {
        if (this.f64904OooOo0) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C21922OoooOOO());
            OooOO0o("  ", printWriter, true);
            printWriter.close();
        }
        this.f64904OooOo0 = true;
        boolean z3 = this.f65005OooO;
        FragmentManager fragmentManager = this.f64905OooOo00;
        if (z3) {
            this.f64906OooOo0O = fragmentManager.f64807OooOO0O.getAndIncrement();
        } else {
            this.f64906OooOo0O = -1;
        }
        if (z2) {
            fragmentManager.OooOo(this, z);
        }
        return this.f64906OooOo0O;
    }

    @Override // androidx.fragment.app.FragmentManager.OooOOOO
    public final boolean OooO00o(ArrayList<OooO00o> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f65005OooO) {
            return true;
        }
        this.f64905OooOo00.f64801OooO0Oo.add(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC21907Oooo
    public final void OooO0Oo(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            o000Oo0.OooO0O0.OooO0OO(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(com.aspose.slides.OooOOO.OooO0O0(sb, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        OooO0OO(new AbstractC21907Oooo.OooO00o(fragment, i2));
        fragment.mFragmentManager = this.f64905OooOo00;
    }

    public final void OooO0o(int i) {
        if (this.f65005OooO) {
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList<AbstractC21907Oooo.OooO00o> arrayList = this.f65008OooO0OO;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC21907Oooo.OooO00o oooO00o = arrayList.get(i2);
                Fragment fragment = oooO00o.f65026OooO0O0;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + oooO00o.f65026OooO0O0 + " to " + oooO00o.f65026OooO0O0.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void OooO0oO() {
        ArrayList<AbstractC21907Oooo.OooO00o> arrayList = this.f65008OooO0OO;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            AbstractC21907Oooo.OooO00o oooO00o = arrayList.get(size);
            if (oooO00o.f65027OooO0OO) {
                if (oooO00o.f65025OooO00o == 8) {
                    oooO00o.f65027OooO0OO = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = oooO00o.f65026OooO0O0.mContainerId;
                    oooO00o.f65025OooO00o = 2;
                    oooO00o.f65027OooO0OO = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        AbstractC21907Oooo.OooO00o oooO00o2 = arrayList.get(i2);
                        if (oooO00o2.f65027OooO0OO && oooO00o2.f65026OooO0O0.mContainerId == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int OooO0oo() {
        return OooO(false, true);
    }

    public final void OooOO0() {
        if (this.f65005OooO) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f65014OooOO0 = false;
        this.f64905OooOo00.OooOoOO(this, false);
    }

    public final void OooOO0O() {
        if (this.f65005OooO) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f65014OooOO0 = false;
        this.f64905OooOo00.OooOoOO(this, true);
    }

    public final void OooOO0o(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f65015OooOO0O);
            printWriter.print(" mIndex=");
            printWriter.print(this.f64906OooOo0O);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f64904OooOo0);
            if (this.f65013OooO0oo != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f65013OooO0oo));
            }
            if (this.f65009OooO0Oo != 0 || this.f65011OooO0o0 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f65009OooO0Oo));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f65011OooO0o0));
            }
            if (this.f65010OooO0o != 0 || this.f65012OooO0oO != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f65010OooO0o));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f65012OooO0oO));
            }
            if (this.f65016OooOO0o != 0 || this.f65018OooOOO0 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f65016OooOO0o));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f65018OooOOO0);
            }
            if (this.f65017OooOOO != 0 || this.f65019OooOOOO != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f65017OooOOO));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f65019OooOOOO);
            }
        }
        ArrayList<AbstractC21907Oooo.OooO00o> arrayList = this.f65008OooO0OO;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC21907Oooo.OooO00o oooO00o = arrayList.get(i);
            switch (oooO00o.f65025OooO00o) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + oooO00o.f65025OooO00o;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(oooO00o.f65026OooO0O0);
            if (z) {
                if (oooO00o.f65028OooO0Oo != 0 || oooO00o.f65030OooO0o0 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(oooO00o.f65028OooO0Oo));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(oooO00o.f65030OooO0o0));
                }
                if (oooO00o.f65029OooO0o != 0 || oooO00o.f65031OooO0oO != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(oooO00o.f65029OooO0o));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(oooO00o.f65031OooO0oO));
                }
            }
        }
    }

    public final OooO00o OooOOO(Fragment fragment, AbstractC21979OooOOo0.OooO0O0 oooO0O0) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.f64905OooOo00;
        if (fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
        }
        if (oooO0O0 == AbstractC21979OooOOo0.OooO0O0.f65537OooOo && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + oooO0O0 + " after the Fragment has been created");
        }
        if (oooO0O0 == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + oooO0O0 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        AbstractC21907Oooo.OooO00o oooO00o = new AbstractC21907Oooo.OooO00o();
        oooO00o.f65025OooO00o = 10;
        oooO00o.f65026OooO0O0 = fragment;
        oooO00o.f65027OooO0OO = false;
        oooO00o.f65032OooO0oo = fragment.mMaxState;
        oooO00o.f65024OooO = oooO0O0;
        OooO0OO(oooO00o);
        return this;
    }

    public final OooO00o OooOOO0(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f64905OooOo00) {
            OooO0OO(new AbstractC21907Oooo.OooO00o(fragment, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final OooO00o OooOOOO(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f64905OooOo00) {
            OooO0OO(new AbstractC21907Oooo.OooO00o(fragment, 8));
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f64906OooOo0O >= 0) {
            sb.append(" #");
            sb.append(this.f64906OooOo0O);
        }
        if (this.f65015OooOO0O != null) {
            sb.append(" ");
            sb.append(this.f65015OooOO0O);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OooO00o(OooO00o oooO00o) {
        C21901OooOoO0 c21901OooOoO0Oooo0O0 = oooO00o.f64905OooOo00.Oooo0O0();
        AbstractC21900OooOoO<?> abstractC21900OooOoO = oooO00o.f64905OooOo00.f64816OooOo;
        super(c21901OooOoO0Oooo0O0, abstractC21900OooOoO != null ? abstractC21900OooOoO.f64990OooOo.getClassLoader() : null);
        for (AbstractC21907Oooo.OooO00o oooO00o2 : oooO00o.f65008OooO0OO) {
            ArrayList<AbstractC21907Oooo.OooO00o> arrayList = this.f65008OooO0OO;
            AbstractC21907Oooo.OooO00o oooO00o3 = new AbstractC21907Oooo.OooO00o();
            oooO00o3.f65025OooO00o = oooO00o2.f65025OooO00o;
            oooO00o3.f65026OooO0O0 = oooO00o2.f65026OooO0O0;
            oooO00o3.f65027OooO0OO = oooO00o2.f65027OooO0OO;
            oooO00o3.f65028OooO0Oo = oooO00o2.f65028OooO0Oo;
            oooO00o3.f65030OooO0o0 = oooO00o2.f65030OooO0o0;
            oooO00o3.f65029OooO0o = oooO00o2.f65029OooO0o;
            oooO00o3.f65031OooO0oO = oooO00o2.f65031OooO0oO;
            oooO00o3.f65032OooO0oo = oooO00o2.f65032OooO0oo;
            oooO00o3.f65024OooO = oooO00o2.f65024OooO;
            arrayList.add(oooO00o3);
        }
        this.f65009OooO0Oo = oooO00o.f65009OooO0Oo;
        this.f65011OooO0o0 = oooO00o.f65011OooO0o0;
        this.f65010OooO0o = oooO00o.f65010OooO0o;
        this.f65012OooO0oO = oooO00o.f65012OooO0oO;
        this.f65013OooO0oo = oooO00o.f65013OooO0oo;
        this.f65005OooO = oooO00o.f65005OooO;
        this.f65014OooOO0 = oooO00o.f65014OooOO0;
        this.f65015OooOO0O = oooO00o.f65015OooOO0O;
        this.f65017OooOOO = oooO00o.f65017OooOOO;
        this.f65019OooOOOO = oooO00o.f65019OooOOOO;
        this.f65016OooOO0o = oooO00o.f65016OooOO0o;
        this.f65018OooOOO0 = oooO00o.f65018OooOOO0;
        if (oooO00o.f65020OooOOOo != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f65020OooOOOo = arrayList2;
            arrayList2.addAll(oooO00o.f65020OooOOOo);
        }
        if (oooO00o.f65022OooOOo0 != null) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            this.f65022OooOOo0 = arrayList3;
            arrayList3.addAll(oooO00o.f65022OooOOo0);
        }
        this.f65021OooOOo = oooO00o.f65021OooOOo;
        this.f64906OooOo0O = -1;
        this.f64907OooOo0o = false;
        this.f64905OooOo00 = oooO00o.f64905OooOo00;
        this.f64904OooOo0 = oooO00o.f64904OooOo0;
        this.f64906OooOo0O = oooO00o.f64906OooOo0O;
        this.f64907OooOo0o = oooO00o.f64907OooOo0o;
    }
}
