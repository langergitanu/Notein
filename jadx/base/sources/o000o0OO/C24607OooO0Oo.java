package o000o0OO;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.C21881OooOOOo;
import androidx.fragment.app.FragmentManager.C21882OooOOo;
import androidx.fragment.app.FragmentManager.C21884OooOOoo;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24587OooOoo;
import o000o0O0.OooOO0;
import o000o0O0.Oooo0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0o0Oo.C33769Ooooo0o;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o000o0OO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Oooo0.OooO00o("fragment")
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m80612d2 = {"Lo000o0OO/OooO0Oo;", "Lo000o0O0/Oooo0;", "Lo000o0OO/OooO0Oo$OooO00o;", "OooO00o", "navigation-fragment_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public class C24607OooO0Oo extends Oooo0<OooO00o> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f83383OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final FragmentManager f83384OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedHashSet f83385OooO0o = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f83386OooO0o0;

    /* JADX INFO: renamed from: o000o0OO.OooO0Oo$OooO00o */
    public static class OooO00o extends C24583OooOo0o {

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public String f83387Oooo00O;

        public OooO00o() {
            throw null;
        }

        @Override // o000o0O0.C24583OooOo0o
        public final void OooO0oo(Context context, AttributeSet attributeSet) {
            super.OooO0oo(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C24608OooO0o0.f83389OooO0O0);
            OooOOO0.OooO0o(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f83387Oooo00O = string;
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            typedArrayObtainAttributes.recycle();
        }

        @Override // o000o0O0.C24583OooOo0o
        public final boolean equals(Object obj) {
            return obj != null && (obj instanceof OooO00o) && super.equals(obj) && OooOOO0.OooO0O0(this.f83387Oooo00O, ((OooO00o) obj).f83387Oooo00O);
        }

        @Override // o000o0O0.C24583OooOo0o
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f83387Oooo00O;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // o000o0O0.C24583OooOo0o
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f83387Oooo00O;
            if (str == null) {
                sb.append(CloudMetaExtra.DEFINE_NON_PARENT_ID);
            } else {
                sb.append(str);
            }
            String string = sb.toString();
            OooOOO0.OooO0o(string, "sb.toString()");
            return string;
        }
    }

    public C24607OooO0Oo(Context context, FragmentManager fragmentManager, int i) {
        this.f83383OooO0OO = context;
        this.f83384OooO0Oo = fragmentManager;
        this.f83386OooO0o0 = i;
    }

    @Override // o000o0O0.Oooo0
    public final void OooO(OooOO0 popUpTo, boolean z) {
        OooOOO0.OooO0oO(popUpTo, "popUpTo");
        FragmentManager fragmentManager = this.f83384OooO0Oo;
        if (fragmentManager.OoooO00()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z) {
            List list = (List) ((C33769Ooooo0o) OooO0O0().f83372OooO0o0).f121747OooOo0o.getValue();
            OooOO0 oooOO02 = (OooOO0) OooOo.Oooo0oO(list);
            for (OooOO0 oooOO03 : OooOo.Oooooo0(list.subList(list.indexOf(popUpTo), list.size()))) {
                if (OooOOO0.OooO0O0(oooOO03, oooOO02)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + oooOO03);
                } else {
                    fragmentManager.OooOo(fragmentManager.new C21884OooOOoo(oooOO03.f83195OooOoo0), false);
                    this.f83385OooO0o.add(oooOO03.f83195OooOoo0);
                }
            }
        } else {
            fragmentManager.OooOo(fragmentManager.new C21881OooOOOo(popUpTo.f83195OooOoo0, -1), false);
        }
        OooO0O0().OooO0oo(popUpTo, z);
    }

    @Override // o000o0O0.Oooo0
    public final C24583OooOo0o OooO00o() {
        return new OooO00o(this);
    }

    @Override // o000o0O0.Oooo0
    public final void OooO0Oo(List list, C24587OooOoo c24587OooOoo) {
        FragmentManager fragmentManager = this.f83384OooO0Oo;
        if (fragmentManager.OoooO00()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OooOO0 oooOO02 = (OooOO0) it.next();
            boolean zIsEmpty = ((List) ((C33769Ooooo0o) OooO0O0().f83372OooO0o0).f121747OooOo0o.getValue()).isEmpty();
            if (c24587OooOoo == null || zIsEmpty || !c24587OooOoo.f83320OooO0O0 || !this.f83385OooO0o.remove(oooOO02.f83195OooOoo0)) {
                androidx.fragment.app.OooO00o oooO00oOooOO0O = OooOO0O(oooOO02, c24587OooOoo);
                if (!zIsEmpty) {
                    if (!oooO00oOooOO0O.f65014OooOO0) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    oooO00oOooOO0O.f65005OooO = true;
                    oooO00oOooOO0O.f65015OooOO0O = oooOO02.f83195OooOoo0;
                }
                oooO00oOooOO0O.OooO0oo();
                OooO0O0().OooO(oooOO02);
            } else {
                fragmentManager.OooOo(fragmentManager.new C21882OooOOo(oooOO02.f83195OooOoo0), false);
                OooO0O0().OooO(oooOO02);
            }
        }
    }

    @Override // o000o0O0.Oooo0
    public final void OooO0o(OooOO0 oooOO02) {
        FragmentManager fragmentManager = this.f83384OooO0Oo;
        if (fragmentManager.OoooO00()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.OooO00o oooO00oOooOO0O = OooOO0O(oooOO02, null);
        if (((List) ((C33769Ooooo0o) OooO0O0().f83372OooO0o0).f121747OooOo0o.getValue()).size() > 1) {
            String str = oooOO02.f83195OooOoo0;
            fragmentManager.OooOo(fragmentManager.new C21881OooOOOo(str, -1), false);
            if (!oooO00oOooOO0O.f65014OooOO0) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            oooO00oOooOO0O.f65005OooO = true;
            oooO00oOooOO0O.f65015OooOO0O = str;
        }
        oooO00oOooOO0O.OooO0oo();
        OooO0O0().OooO0oO(oooOO02);
    }

    @Override // o000o0O0.Oooo0
    public final void OooO0oO(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f83385OooO0o;
            linkedHashSet.clear();
            C34431OooOo0.OooOo0o(linkedHashSet, stringArrayList);
        }
    }

    @Override // o000o0O0.Oooo0
    public final Bundle OooO0oo() {
        LinkedHashSet linkedHashSet = this.f83385OooO0o;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return BundleKt.bundleOf(new C32443OooOOO("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    public final androidx.fragment.app.OooO00o OooOO0O(OooOO0 oooOO02, C24587OooOoo c24587OooOoo) {
        String str = ((OooO00o) oooOO02.f83189OooOo).f83387Oooo00O;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f83383OooO0OO;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        FragmentManager fragmentManager = this.f83384OooO0Oo;
        Fragment fragmentOooO00o = fragmentManager.Oooo0O0().OooO00o(context.getClassLoader(), str);
        OooOOO0.OooO0o(fragmentOooO00o, "fragmentManager.fragment…t.classLoader, className)");
        fragmentOooO00o.setArguments(oooOO02.f83192OooOoO0);
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(fragmentManager);
        int i = c24587OooOoo != null ? c24587OooOoo.f83323OooO0o : -1;
        int i2 = c24587OooOoo != null ? c24587OooOoo.f83325OooO0oO : -1;
        int i3 = c24587OooOoo != null ? c24587OooOoo.f83326OooO0oo : -1;
        int i4 = c24587OooOoo != null ? c24587OooOoo.f83318OooO : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            oooO00o.f65009OooO0Oo = i;
            oooO00o.f65011OooO0o0 = i2;
            oooO00o.f65010OooO0o = i3;
            oooO00o.f65012OooO0oO = i5;
        }
        oooO00o.OooO0o0(fragmentOooO00o, this.f83386OooO0o0);
        oooO00o.OooOOOO(fragmentOooO00o);
        oooO00o.f65021OooOOo = true;
        return oooO00o;
    }
}
