package o000o0OO;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC21913Oooo0o0;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C24039Oooo0o0;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24587OooOoo;
import o000o0O0.InterfaceC24566OooO0Oo;
import o000o0O0.OooOO0;
import o000o0O0.Oooo0;
import oO0o0Oo.C33769Ooooo0o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o000o0OO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Oooo0.OooO00o("dialog")
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m80612d2 = {"Lo000o0OO/OooO0OO;", "Lo000o0O0/Oooo0;", "Lo000o0OO/OooO0OO$OooO00o;", "OooO00o", "navigation-fragment_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class C24606OooO0OO extends Oooo0<OooO00o> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f83378OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final FragmentManager f83379OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LinkedHashSet f83381OooO0o0 = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C24604OooO00o f83380OooO0o = new InterfaceC21986OooOoOO() { // from class: o000o0OO.OooO00o
        @Override // androidx.lifecycle.InterfaceC21986OooOoOO
        public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
            Object objPrevious;
            C24606OooO0OO this$0 = this.f83376OooOo0o;
            OooOOO0.OooO0oO(this$0, "this$0");
            if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_CREATE) {
                DialogFragment dialogFragment = (DialogFragment) interfaceC21987OooOoo;
                Iterable iterable = (Iterable) ((C33769Ooooo0o) this$0.OooO0O0().f83372OooO0o0).f121747OooOo0o.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (OooOOO0.OooO0O0(((OooOO0) it.next()).f83195OooOoo0, dialogFragment.getTag())) {
                            return;
                        }
                    }
                }
                dialogFragment.dismiss();
                return;
            }
            if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_STOP) {
                DialogFragment dialogFragment2 = (DialogFragment) interfaceC21987OooOoo;
                if (dialogFragment2.requireDialog().isShowing()) {
                    return;
                }
                List list = (List) ((C33769Ooooo0o) this$0.OooO0O0().f83372OooO0o0).f121747OooOo0o.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (OooOOO0.OooO0O0(((OooOO0) objPrevious).f83195OooOoo0, dialogFragment2.getTag())) {
                            break;
                        }
                    }
                }
                if (objPrevious == null) {
                    throw new IllegalStateException(("Dialog " + dialogFragment2 + " has already been popped off of the Navigation back stack").toString());
                }
                OooOO0 oooOO02 = (OooOO0) objPrevious;
                if (!OooOOO0.OooO0O0(OooOo.OoooOo0(list), oooOO02)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + dialogFragment2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                this$0.OooO(oooOO02, false);
            }
        }
    };

    /* JADX INFO: renamed from: o000o0OO.OooO0OO$OooO00o */
    public static class OooO00o extends C24583OooOo0o implements InterfaceC24566OooO0Oo {

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public String f83382Oooo00O;

        public OooO00o() {
            throw null;
        }

        @Override // o000o0O0.C24583OooOo0o
        public final void OooO0oo(Context context, AttributeSet attributeSet) {
            super.OooO0oo(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C24608OooO0o0.f83388OooO00o);
            OooOOO0.OooO0o(typedArrayObtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f83382Oooo00O = string;
            }
            typedArrayObtainAttributes.recycle();
        }

        @Override // o000o0O0.C24583OooOo0o
        public final boolean equals(Object obj) {
            return obj != null && (obj instanceof OooO00o) && super.equals(obj) && OooOOO0.OooO0O0(this.f83382Oooo00O, ((OooO00o) obj).f83382Oooo00O);
        }

        @Override // o000o0O0.C24583OooOo0o
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f83382Oooo00O;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [o000o0OO.OooO00o] */
    public C24606OooO0OO(Context context, FragmentManager fragmentManager) {
        this.f83378OooO0OO = context;
        this.f83379OooO0Oo = fragmentManager;
    }

    @Override // o000o0O0.Oooo0
    public final void OooO(OooOO0 popUpTo, boolean z) {
        OooOOO0.OooO0oO(popUpTo, "popUpTo");
        FragmentManager fragmentManager = this.f83379OooO0Oo;
        if (fragmentManager.OoooO00()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((C33769Ooooo0o) OooO0O0().f83372OooO0o0).f121747OooOo0o.getValue();
        Iterator it = OooOo.Oooooo0(list.subList(list.indexOf(popUpTo), list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentOooOooo = fragmentManager.OooOooo(((OooOO0) it.next()).f83195OooOoo0);
            if (fragmentOooOooo != null) {
                fragmentOooOooo.getLifecycle().OooO0OO(this.f83380OooO0o);
                ((DialogFragment) fragmentOooOooo).dismiss();
            }
        }
        OooO0O0().OooO0oo(popUpTo, z);
    }

    @Override // o000o0O0.Oooo0
    public final C24583OooOo0o OooO00o() {
        return new OooO00o(this);
    }

    @Override // o000o0O0.Oooo0
    public final void OooO0Oo(List list, C24587OooOoo c24587OooOoo) {
        FragmentManager fragmentManager = this.f83379OooO0Oo;
        if (fragmentManager.OoooO00()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OooOO0 oooOO02 = (OooOO0) it.next();
            OooO00o oooO00o = (OooO00o) oooOO02.f83189OooOo;
            String str = oooO00o.f83382Oooo00O;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
            }
            char cCharAt = str.charAt(0);
            Context context = this.f83378OooO0OO;
            if (cCharAt == '.') {
                str = context.getPackageName() + str;
            }
            Fragment fragmentOooO00o = fragmentManager.Oooo0O0().OooO00o(context.getClassLoader(), str);
            OooOOO0.OooO0o(fragmentOooO00o, "fragmentManager.fragment…ader, className\n        )");
            if (!DialogFragment.class.isAssignableFrom(fragmentOooO00o.getClass())) {
                StringBuilder sb = new StringBuilder("Dialog destination ");
                String str2 = oooO00o.f83382Oooo00O;
                if (str2 == null) {
                    throw new IllegalStateException("DialogFragment class was not set");
                }
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(sb, str2, " is not an instance of DialogFragment").toString());
            }
            DialogFragment dialogFragment = (DialogFragment) fragmentOooO00o;
            dialogFragment.setArguments(oooOO02.f83192OooOoO0);
            dialogFragment.getLifecycle().OooO00o(this.f83380OooO0o);
            dialogFragment.show(fragmentManager, oooOO02.f83195OooOoo0);
            OooO0O0().OooO(oooOO02);
        }
    }

    @Override // o000o0O0.Oooo0
    public final void OooO0o0(C24572OooOO0o.OooO00o oooO00o) {
        AbstractC21979OooOOo0 lifecycle;
        super.OooO0o0(oooO00o);
        Iterator it = ((List) ((C33769Ooooo0o) oooO00o.f83372OooO0o0).f121747OooOo0o.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            FragmentManager fragmentManager = this.f83379OooO0Oo;
            if (!zHasNext) {
                fragmentManager.f64814OooOOo0.add(new InterfaceC21913Oooo0o0() { // from class: o000o0OO.OooO0O0
                    @Override // androidx.fragment.app.InterfaceC21913Oooo0o0
                    public final void OooO00o(FragmentManager fragmentManager2, Fragment fragment) {
                        C24606OooO0OO this$0 = this.f83377OooOo0o;
                        OooOOO0.OooO0oO(this$0, "this$0");
                        OooOOO0.OooO0oO(fragmentManager2, "<anonymous parameter 0>");
                        LinkedHashSet linkedHashSet = this$0.f83381OooO0o0;
                        String tag = fragment.getTag();
                        C24039Oooo0o0.OooO00o(linkedHashSet);
                        if (linkedHashSet.remove(tag)) {
                            fragment.getLifecycle().OooO00o(this$0.f83380OooO0o);
                        }
                    }
                });
                return;
            }
            OooOO0 oooOO02 = (OooOO0) it.next();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.OooOooo(oooOO02.f83195OooOoo0);
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.f83381OooO0o0.add(oooOO02.f83195OooOoo0);
            } else {
                lifecycle.OooO00o(this.f83380OooO0o);
            }
        }
    }
}
