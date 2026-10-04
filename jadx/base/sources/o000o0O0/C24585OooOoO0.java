package o000o0O0;

import OooOo.C20494Oooo0O0;
import OooOo.C20495Oooo0OO;
import OooOo.C20496Oooo0o0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o000o0O.C24563OooO00o;
import o000o0O0.C24583OooOo0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.C33562OooO00o;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: renamed from: o000o0O0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24585OooOoO0 extends C24583OooOo0o implements Iterable<C24583OooOo0o>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ int f83310Oooo0O0 = 0;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public String f83311Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final OooOo.Oooo0<C24583OooOo0o> f83312Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f83313Oooo00o;

    /* JADX INFO: renamed from: o000o0O0.OooOoO0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: o000o0O0.OooOoO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19638OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C24583OooOo0o, C24583OooOo0o> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final C19638OooO00o f83314OooOo0o = new C19638OooO00o(1);

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final C24583OooOo0o invoke(C24583OooOo0o c24583OooOo0o) {
                C24583OooOo0o it = c24583OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                if (!(it instanceof C24585OooOoO0)) {
                    return null;
                }
                C24585OooOoO0 c24585OooOoO0 = (C24585OooOoO0) it;
                return c24585OooOoO0.OooOO0(c24585OooOoO0.f83313Oooo00o, true);
            }
        }

        public static C24583OooOo0o OooO00o(C24585OooOoO0 c24585OooOoO0) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(c24585OooOoO0, "<this>");
            return (C24583OooOo0o) C33576OooOOOo.OooOOo(C33574OooOOO0.OooO(c24585OooOoO0.OooOO0(c24585OooOoO0.f83313Oooo00o, true), C19638OooO00o.f83314OooOo0o));
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOoO0$OooO0O0 */
    public static final class OooO0O0 implements Iterator<C24583OooOo0o>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f83315OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f83316OooOo0o = -1;

        public OooO0O0() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f83316OooOo0o + 1 < C24585OooOoO0.this.f83312Oooo00O.OooO0o();
        }

        @Override // java.util.Iterator
        public final C24583OooOo0o next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f83315OooOo = true;
            OooOo.Oooo0<C24583OooOo0o> oooo0 = C24585OooOoO0.this.f83312Oooo00O;
            int i = this.f83316OooOo0o + 1;
            this.f83316OooOo0o = i;
            C24583OooOo0o c24583OooOo0oOooO0oO = oooo0.OooO0oO(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(c24583OooOo0oOooO0oO, "nodes.valueAt(++index)");
            return c24583OooOo0oOooO0oO;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f83315OooOo) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            C24585OooOoO0 c24585OooOoO0 = C24585OooOoO0.this;
            int i = this.f83316OooOo0o;
            OooOo.Oooo0<C24583OooOo0o> oooo0 = c24585OooOoO0.f83312Oooo00O;
            oooo0.OooO0oO(i).f83295OooOo = null;
            int i2 = this.f83316OooOo0o;
            Object[] objArr = oooo0.f58540OooOoO0;
            Object obj = objArr[i2];
            Object obj2 = C20494Oooo0O0.f58551OooO00o;
            if (obj != obj2) {
                objArr[i2] = obj2;
                oooo0.f58538OooOo0o = true;
            }
            this.f83316OooOo0o = i2 - 1;
            this.f83315OooOo = false;
        }
    }

    public C24585OooOoO0(C24584OooOoO c24584OooOoO) {
        super(c24584OooOoO);
        this.f83312Oooo00O = new OooOo.Oooo0<>();
    }

    public final void OooO(C24583OooOo0o node) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(node, "node");
        int i = node.f83302OooOooO;
        String str = node.f83303OooOooo;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.f83303OooOooo;
        if (str2 != null && kotlin.jvm.internal.OooOOO0.OooO0O0(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (i == this.f83302OooOooO) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        OooOo.Oooo0<C24583OooOo0o> oooo0 = this.f83312Oooo00O;
        C24583OooOo0o c24583OooOo0oOooO0OO = oooo0.OooO0OO(i);
        if (c24583OooOo0oOooO0OO == node) {
            return;
        }
        if (node.f83295OooOo != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (c24583OooOo0oOooO0OO != null) {
            c24583OooOo0oOooO0OO.f83295OooOo = null;
        }
        node.f83295OooOo = this;
        oooo0.OooO0o0(node.f83302OooOooO, node);
    }

    @Override // o000o0O0.C24583OooOo0o
    public final C24583OooOo0o.OooO0O0 OooO0oO(C24581OooOo0 c24581OooOo0) {
        C24583OooOo0o.OooO0O0 oooO0O0OooO0oO = super.OooO0oO(c24581OooOo0);
        ArrayList arrayList = new ArrayList();
        OooO0O0 oooO0O0 = new OooO0O0();
        while (oooO0O0.hasNext()) {
            C24583OooOo0o.OooO0O0 oooO0O0OooO0oO2 = ((C24583OooOo0o) oooO0O0.next()).OooO0oO(c24581OooOo0);
            if (oooO0O0OooO0oO2 != null) {
                arrayList.add(oooO0O0OooO0oO2);
            }
        }
        return (C24583OooOo0o.OooO0O0) oOo000Oo.OooOo.OoooOoO(oOo000Oo.OooOOO.OooOoO(new C24583OooOo0o.OooO0O0[]{oooO0O0OooO0oO, (C24583OooOo0o.OooO0O0) oOo000Oo.OooOo.OoooOoO(arrayList)}));
    }

    @Override // o000o0O0.C24583OooOo0o
    public final void OooO0oo(Context context, AttributeSet attributeSet) {
        String strValueOf;
        super.OooO0oo(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C24563OooO00o.f83166OooO0Oo);
        kotlin.jvm.internal.OooOOO0.OooO0o(typedArrayObtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        if (resourceId == this.f83302OooOooO) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        this.f83313Oooo00o = resourceId;
        this.f83311Oooo0 = null;
        if (resourceId <= 16777215) {
            strValueOf = String.valueOf(resourceId);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(resourceId);
            }
            kotlin.jvm.internal.OooOOO0.OooO0o(strValueOf, "try {\n                co….toString()\n            }");
        }
        this.f83311Oooo0 = strValueOf;
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        typedArrayObtainAttributes.recycle();
    }

    public final C24583OooOo0o OooOO0(int i, boolean z) {
        C24585OooOoO0 c24585OooOoO0;
        C24583OooOo0o c24583OooOo0oOooO0OO = this.f83312Oooo00O.OooO0OO(i);
        if (c24583OooOo0oOooO0OO != null) {
            return c24583OooOo0oOooO0OO;
        }
        if (!z || (c24585OooOoO0 = this.f83295OooOo) == null) {
            return null;
        }
        return c24585OooOoO0.OooOO0(i, true);
    }

    @Override // o000o0O0.C24583OooOo0o
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C24585OooOoO0)) {
            return false;
        }
        OooOo.Oooo0<C24583OooOo0o> oooo0 = this.f83312Oooo00O;
        InterfaceC33569OooO0oo interfaceC33569OooO0ooOooO0o = C33574OooOOO0.OooO0o(C20496Oooo0o0.OooO(oooo0));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C33562OooO00o) interfaceC33569OooO0ooOooO0o).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        C24585OooOoO0 c24585OooOoO0 = (C24585OooOoO0) obj;
        OooOo.Oooo0<C24583OooOo0o> oooo02 = c24585OooOoO0.f83312Oooo00O;
        C20495Oooo0OO c20495Oooo0OOOooO = C20496Oooo0o0.OooO(oooo02);
        while (c20495Oooo0OOOooO.hasNext()) {
            arrayList.remove((C24583OooOo0o) c20495Oooo0OOOooO.next());
        }
        return super.equals(obj) && oooo0.OooO0o() == oooo02.OooO0o() && this.f83313Oooo00o == c24585OooOoO0.f83313Oooo00o && arrayList.isEmpty();
    }

    @Override // o000o0O0.C24583OooOo0o
    public final int hashCode() {
        int iOooO0Oo = this.f83313Oooo00o;
        OooOo.Oooo0<C24583OooOo0o> oooo0 = this.f83312Oooo00O;
        int iOooO0o = oooo0.OooO0o();
        for (int i = 0; i < iOooO0o; i++) {
            iOooO0Oo = (((iOooO0Oo * 31) + oooo0.OooO0Oo(i)) * 31) + oooo0.OooO0oO(i).hashCode();
        }
        return iOooO0Oo;
    }

    @Override // java.lang.Iterable
    public final Iterator<C24583OooOo0o> iterator() {
        return new OooO0O0();
    }

    @Override // o000o0O0.C24583OooOo0o
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        C24583OooOo0o c24583OooOo0oOooOO0 = OooOO0(this.f83313Oooo00o, true);
        sb.append(" startDestination=");
        if (c24583OooOo0oOooOO0 == null) {
            String str = this.f83311Oooo0;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(this.f83313Oooo00o));
            }
        } else {
            sb.append("{");
            sb.append(c24583OooOo0oOooOO0.toString());
            sb.append("}");
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "sb.toString()");
        return string;
    }
}
