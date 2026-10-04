package o0OOoOo0;

import androidx.appcompat.widget.C21532OooOOo;
import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.LabelColor;
import com.orion.notein.domain.models.LabelRef;
import com.orion.notein.domain.models.LabelType;
import java.util.List;
import o0OOo0Oo.InterfaceC27306OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoOo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27798OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27306OooOo00 f98196OooO00o;

    public C27798OooO0o0(InterfaceC27306OooOo00 labelRepo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(labelRepo, "labelRepo");
        this.f98196OooO00o = labelRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, Long l, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27793OooO00o c27793OooO00o;
        if (abstractC32479OooO0OO instanceof C27793OooO00o) {
            c27793OooO00o = (C27793OooO00o) abstractC32479OooO0OO;
            int i = c27793OooO00o.f98177OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27793OooO00o.f98177OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27793OooO00o = new C27793OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo0 = c27793OooO00o.f98175OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27793OooO00o.f98177OooOoO;
        boolean z = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo0);
            String string = C33599OooOo0O.Oooooo0(str).toString();
            c27793OooO00o.f98176OooOo0o = l;
            c27793OooO00o.f98177OooOoO = 1;
            objOooOOo0 = this.f98196OooO00o.OooOOo0(string, c27793OooO00o);
            if (objOooOOo0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l = c27793OooO00o.f98176OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo0);
        }
        Label label = (Label) objOooOOo0;
        if (label == null || (l != null && label.getId() == l.longValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(int i, long j, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27794OooO0O0 c27794OooO0O0;
        if (abstractC32479OooO0OO instanceof C27794OooO0O0) {
            c27794OooO0O0 = (C27794OooO0O0) abstractC32479OooO0OO;
            int i2 = c27794OooO0O0.f98181OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27794OooO0O0.f98181OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c27794OooO0O0 = new C27794OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27794OooO0O0.f98180OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27794OooO0O0.f98181OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            LabelType labelTypeFromValue = LabelType.INSTANCE.fromValue(i);
            if (labelTypeFromValue != null) {
                LabelRef labelRef = new LabelRef(j, labelTypeFromValue, str, str2, System.currentTimeMillis(), System.currentTimeMillis());
                c27794OooO0O0.f98181OooOoO0 = 1;
                if (this.f98196OooO00o.OooOO0(labelRef, c27794OooO0O0) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                C34406OooO00o.f123390OooO00o.OooO0OO(C21532OooOOo.OooO0OO(i, "createItemLabelRef: invalid itemType: "), new Object[0]);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(int i, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27795OooO0OO c27795OooO0OO;
        C27798OooO0o0 c27798OooO0o0;
        if (abstractC32479OooO0OO instanceof C27795OooO0OO) {
            c27795OooO0OO = (C27795OooO0OO) abstractC32479OooO0OO;
            int i2 = c27795OooO0OO.f98187OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27795OooO0OO.f98187OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c27795OooO0OO = new C27795OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c27795OooO0OO.f98184OooOoO;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27795OooO0OO.f98187OooOoo0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            c27795OooO0OO.f98183OooOo0o = this;
            c27795OooO0OO.f98182OooOo = str;
            c27795OooO0OO.f98185OooOoO0 = i;
            c27795OooO0OO.f98187OooOoo0 = 1;
            objOooOOO0 = this.f98196OooO00o.OooOOO0();
            if (objOooOOO0 != obj) {
                c27798OooO0o0 = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOO0);
            return objOooOOO0;
        }
        i = c27795OooO0OO.f98185OooOoO0;
        str = c27795OooO0OO.f98182OooOo;
        c27798OooO0o0 = c27795OooO0OO.f98183OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOO0);
        int colorValue = ((LabelColor) ((List) objOooOOO0).get(i)).getColorValue();
        c27795OooO0OO.f98183OooOo0o = null;
        c27795OooO0OO.f98182OooOo = null;
        c27795OooO0OO.f98187OooOoo0 = 2;
        Object objOooO0Oo = c27798OooO0o0.OooO0Oo(colorValue, str, c27795OooO0OO);
        return objOooO0Oo == obj ? obj : objOooO0Oo;
    }

    public final Object OooO0Oo(int i, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return this.f98196OooO00o.OooOOO(new Label(0L, C33599OooOo0O.Oooooo0(str).toString(), i, System.currentTimeMillis(), System.currentTimeMillis(), 0.0f, 1, null), abstractC32479OooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, Long l, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27796OooO0Oo c27796OooO0Oo;
        if (abstractC32479OooO0OO instanceof C27796OooO0Oo) {
            c27796OooO0Oo = (C27796OooO0Oo) abstractC32479OooO0OO;
            int i = c27796OooO0Oo.f98190OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27796OooO0Oo.f98190OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27796OooO0Oo = new C27796OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27796OooO0Oo.f98189OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27796OooO0Oo.f98190OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            if (C33599OooOo0O.Oooo0o0(str)) {
                return new Integer(-1);
            }
            if (str.length() > 20) {
                return new Integer(-2);
            }
            c27796OooO0Oo.f98190OooOoO0 = 1;
            objOooO00o = OooO00o(str, l, c27796OooO0Oo);
            if (objOooO00o == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        return ((Boolean) objOooO00o).booleanValue() ? new Integer(-3) : new Integer(0);
    }
}
