package o00o00oO;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.C21929Ooooo0o;
import com.bumptech.glide.EnumC22252OooO0oo;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.C25118OooO0oO;
import o00Ooo0o.C25119OooO0oo;
import o00Ooo0o.EnumC25113OooO0O0;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00Ooo0o.InterfaceC25123OooOOO0;
import o00OooO.AbstractC25133OooOO0o;
import o00o000.C25220OooOOOo;
import o00o000.C25221OooOOo;
import o00o000.OooOO0;
import o00o000.OooOO0O;
import o00o000.OooOOO;
import o00o000.OooOOO0;
import o00o000o.C25249OooO0oo;
import o00o00oO.AbstractC25285OooO00o;
import o00o0O0.C25309OooO0O0;
import o00o0O0.C25316OooOO0o;
import o00o0O00.C25319OooO0OO;

/* JADX INFO: renamed from: o00o00oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25285OooO00o<T extends AbstractC25285OooO00o<T>> implements Cloneable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f86047OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ColorDrawable f86048OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f86050OooOoOO;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f86056Oooo000;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f86060Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f86061Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public Resources.Theme f86062Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f86064Oooo0oo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC25133OooOO0o f86046OooOo = AbstractC25133OooOO0o.f85490OooO0OO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public EnumC22252OooO0oo f86049OooOoO0 = EnumC22252OooO0oo.f67136OooOoO0;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f86052OooOoo0 = true;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f86051OooOoo = -1;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f86053OooOooO = -1;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public InterfaceC25116OooO0o f86054OooOooo = C25319OooO0OO.f86166OooO0O0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f86057Oooo00O = true;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C25111OooO f86058Oooo00o = new C25111OooO();

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C25309OooO0O0 f86055Oooo0 = new C25309OooO0O0();

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public Class<?> f86059Oooo0O0 = Object.class;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f86063Oooo0oO = true;

    public static boolean OooOO0o(int i, int i2) {
        return (i & i2) != 0;
    }

    public T OooO() {
        return (T) OooOoO0(OooOOO0.f85890OooO00o, new C25221OooOOo(), true);
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [android.util.Log, java.lang.String, o00o0O0.OooO0O0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String, o00o0O0.OooO0O0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public T OooO00o(AbstractC25285OooO00o<?> abstractC25285OooO00o) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooO00o(abstractC25285OooO00o);
        }
        int i = abstractC25285OooO00o.f86047OooOo0o;
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 1048576)) {
            this.f86064Oooo0oo = abstractC25285OooO00o.f86064Oooo0oo;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 4)) {
            this.f86046OooOo = abstractC25285OooO00o.f86046OooOo;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 8)) {
            this.f86049OooOoO0 = abstractC25285OooO00o.f86049OooOoO0;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 16)) {
            this.f86047OooOo0o &= -33;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 32)) {
            this.f86047OooOo0o &= -17;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 64)) {
            this.f86048OooOoO = abstractC25285OooO00o.f86048OooOoO;
            this.f86050OooOoOO = 0;
            this.f86047OooOo0o &= -129;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 128)) {
            this.f86050OooOoOO = abstractC25285OooO00o.f86050OooOoOO;
            this.f86048OooOoO = null;
            this.f86047OooOo0o &= -65;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 256)) {
            this.f86052OooOoo0 = abstractC25285OooO00o.f86052OooOoo0;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 512)) {
            this.f86053OooOooO = abstractC25285OooO00o.f86053OooOooO;
            this.f86051OooOoo = abstractC25285OooO00o.f86051OooOoo;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 1024)) {
            this.f86054OooOooo = abstractC25285OooO00o.f86054OooOooo;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 4096)) {
            this.f86059Oooo0O0 = abstractC25285OooO00o.f86059Oooo0O0;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 8192)) {
            this.f86047OooOo0o &= -16385;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 16384)) {
            this.f86047OooOo0o &= -8193;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 32768)) {
            this.f86062Oooo0o0 = abstractC25285OooO00o.f86062Oooo0o0;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 65536)) {
            this.f86057Oooo00O = abstractC25285OooO00o.f86057Oooo00O;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 131072)) {
            this.f86056Oooo000 = abstractC25285OooO00o.f86056Oooo000;
        }
        if (OooOO0o(abstractC25285OooO00o.f86047OooOo0o, 2048)) {
            ?? r0 = this.f86055Oooo0;
            r0.e(abstractC25285OooO00o.f86055Oooo0, r0);
            this.f86063Oooo0oO = abstractC25285OooO00o.f86063Oooo0oO;
        }
        if (!this.f86057Oooo00O) {
            this.f86055Oooo0.clear();
            int i2 = this.f86047OooOo0o;
            this.f86056Oooo000 = false;
            this.f86047OooOo0o = i2 & (-133121);
            this.f86063Oooo0oO = true;
        }
        this.f86047OooOo0o |= abstractC25285OooO00o.f86047OooOo0o;
        this.f86058Oooo00o.f85368OooO0O0.OooO0oo(abstractC25285OooO00o.f86058Oooo00o.f85368OooO0O0);
        OooOoO();
        return this;
    }

    public T OooO0O0() {
        if (this.f86060Oooo0OO && !this.f86061Oooo0o) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f86061Oooo0o = true;
        return (T) OooOOO0();
    }

    public T OooO0OO() {
        return (T) Oooo00o(OooOOO0.f85892OooO0OO, new o00o000.OooO());
    }

    public T OooO0Oo() {
        return (T) Oooo00o(OooOOO0.f85891OooO0O0, new OooOO0O());
    }

    public T OooO0o(Class<?> cls) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooO0o(cls);
        }
        this.f86059Oooo0O0 = cls;
        this.f86047OooOo0o |= 4096;
        OooOoO();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T extends o00o00oO.OooO00o<T>, java.lang.String, o00o00oO.OooO00o] */
    /* JADX WARN: Type inference failed for: r1v3, types: [OooOo.OooO00o, android.util.Log, o00o0O0.OooO0O0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String, o00o0O0.OooO0O0] */
    @Override // 
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            C25111OooO c25111OooO = new C25111OooO();
            t.f86058Oooo00o = c25111OooO;
            c25111OooO.f85368OooO0O0.OooO0oo(this.f86058Oooo00o.f85368OooO0O0);
            ?? c25309OooO0O0 = new C25309OooO0O0();
            t.f86055Oooo0 = c25309OooO0O0;
            c25309OooO0O0.e(this.f86055Oooo0, t);
            t.f86060Oooo0OO = false;
            t.f86061Oooo0o = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public T OooO0oO(AbstractC25133OooOO0o abstractC25133OooOO0o) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooO0oO(abstractC25133OooOO0o);
        }
        C21929Ooooo0o.OooO0OO(abstractC25133OooOO0o, "Argument must not be null");
        this.f86046OooOo = abstractC25133OooOO0o;
        this.f86047OooOo0o |= 4;
        OooOoO();
        return this;
    }

    public T OooO0oo(OooOOO0 oooOOO0) {
        C25119OooO0oo c25119OooO0oo = OooOOO0.f85894OooO0o;
        C21929Ooooo0o.OooO0OO(oooOOO0, "Argument must not be null");
        return (T) OooOoOO(c25119OooO0oo, oooOOO0);
    }

    public AbstractC25285OooO00o OooOO0() {
        EnumC25113OooO0O0 enumC25113OooO0O0 = EnumC25113OooO0O0.f85376OooOo0o;
        return OooOoOO(OooOOO.f85877OooO0o, enumC25113OooO0O0).OooOoOO(o00o00.OooO.f85807OooO00o, enumC25113OooO0O0);
    }

    public final boolean OooOO0O(AbstractC25285OooO00o<?> abstractC25285OooO00o) {
        abstractC25285OooO00o.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        return this.f86050OooOoOO == abstractC25285OooO00o.f86050OooOoOO && C25316OooOO0o.OooO0O0(this.f86048OooOoO, abstractC25285OooO00o.f86048OooOoO) && this.f86052OooOoo0 == abstractC25285OooO00o.f86052OooOoo0 && this.f86051OooOoo == abstractC25285OooO00o.f86051OooOoo && this.f86053OooOooO == abstractC25285OooO00o.f86053OooOooO && this.f86056Oooo000 == abstractC25285OooO00o.f86056Oooo000 && this.f86057Oooo00O == abstractC25285OooO00o.f86057Oooo00O && this.f86046OooOo.equals(abstractC25285OooO00o.f86046OooOo) && this.f86049OooOoO0 == abstractC25285OooO00o.f86049OooOoO0 && this.f86058Oooo00o.equals(abstractC25285OooO00o.f86058Oooo00o) && this.f86055Oooo0.equals(abstractC25285OooO00o.f86055Oooo0) && this.f86059Oooo0O0.equals(abstractC25285OooO00o.f86059Oooo0O0) && C25316OooOO0o.OooO0O0(this.f86054OooOooo, abstractC25285OooO00o.f86054OooOooo) && C25316OooOO0o.OooO0O0(this.f86062Oooo0o0, abstractC25285OooO00o.f86062Oooo0o0);
    }

    public T OooOOO() {
        return (T) OooOOoo(OooOOO0.f85892OooO0OO, new o00o000.OooO());
    }

    public T OooOOO0() {
        this.f86060Oooo0OO = true;
        return this;
    }

    public T OooOOOO() {
        return (T) OooOoO0(OooOOO0.f85891OooO0O0, new OooOO0(), false);
    }

    public T OooOOOo() {
        return (T) OooOoO0(OooOOO0.f85890OooO00o, new C25221OooOOo(), false);
    }

    public T OooOOo(InterfaceC25123OooOOO0<Bitmap> interfaceC25123OooOOO0) {
        return (T) Oooo00O(interfaceC25123OooOOO0, false);
    }

    public final AbstractC25285OooO00o OooOOoo(OooOOO0 oooOOO0, o00o000.OooO0o oooO0o) {
        if (this.f86061Oooo0o) {
            return clone().OooOOoo(oooOOO0, oooO0o);
        }
        OooO0oo(oooOOO0);
        return Oooo00O(oooO0o, false);
    }

    public final T OooOo(C25119OooO0oo<?> c25119OooO0oo) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooOo(c25119OooO0oo);
        }
        this.f86058Oooo00o.f85368OooO0O0.remove(c25119OooO0oo);
        OooOoO();
        return this;
    }

    public T OooOo0(int i) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooOo0(i);
        }
        this.f86050OooOoOO = i;
        int i2 = this.f86047OooOo0o | 128;
        this.f86048OooOoO = null;
        this.f86047OooOo0o = i2 & (-65);
        OooOoO();
        return this;
    }

    public T OooOo00(int i, int i2) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooOo00(i, i2);
        }
        this.f86053OooOooO = i;
        this.f86051OooOoo = i2;
        this.f86047OooOo0o |= 512;
        OooOoO();
        return this;
    }

    public AbstractC25285OooO00o OooOo0O(ColorDrawable colorDrawable) {
        if (this.f86061Oooo0o) {
            return clone().OooOo0O(colorDrawable);
        }
        this.f86048OooOoO = colorDrawable;
        int i = this.f86047OooOo0o | 64;
        this.f86050OooOoOO = 0;
        this.f86047OooOo0o = i & (-129);
        OooOoO();
        return this;
    }

    public AbstractC25285OooO00o OooOo0o() {
        EnumC22252OooO0oo enumC22252OooO0oo = EnumC22252OooO0oo.f67135OooOoO;
        if (this.f86061Oooo0o) {
            return clone().OooOo0o();
        }
        this.f86049OooOoO0 = enumC22252OooO0oo;
        this.f86047OooOo0o |= 8;
        OooOoO();
        return this;
    }

    public final void OooOoO() {
        if (this.f86060Oooo0OO) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final AbstractC25285OooO00o OooOoO0(OooOOO0 oooOOO0, o00o000.OooO0o oooO0o, boolean z) {
        AbstractC25285OooO00o abstractC25285OooO00oOooo00o = z ? Oooo00o(oooOOO0, oooO0o) : OooOOoo(oooOOO0, oooO0o);
        abstractC25285OooO00oOooo00o.f86063Oooo0oO = true;
        return abstractC25285OooO00oOooo00o;
    }

    public <Y> T OooOoOO(C25119OooO0oo<Y> c25119OooO0oo, Y y) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooOoOO(c25119OooO0oo, y);
        }
        C21929Ooooo0o.OooO0O0(c25119OooO0oo);
        C21929Ooooo0o.OooO0O0(y);
        this.f86058Oooo00o.f85368OooO0O0.put(c25119OooO0oo, y);
        OooOoO();
        return this;
    }

    public T OooOoo(boolean z) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooOoo(true);
        }
        this.f86052OooOoo0 = !z;
        this.f86047OooOo0o |= 256;
        OooOoO();
        return this;
    }

    public T OooOoo0(InterfaceC25116OooO0o interfaceC25116OooO0o) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooOoo0(interfaceC25116OooO0o);
        }
        this.f86054OooOooo = interfaceC25116OooO0o;
        this.f86047OooOo0o |= 1024;
        OooOoO();
        return this;
    }

    public T OooOooO(Resources.Theme theme) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooOooO(theme);
        }
        this.f86062Oooo0o0 = theme;
        if (theme != null) {
            this.f86047OooOo0o |= 32768;
            return (T) OooOoOO(C25249OooO0oo.f85972OooO0O0, theme);
        }
        this.f86047OooOo0o &= -32769;
        return (T) OooOo(C25249OooO0oo.f85972OooO0O0);
    }

    public final <Y> T OooOooo(Class<Y> cls, InterfaceC25123OooOOO0<Y> interfaceC25123OooOOO0, boolean z) {
        if (this.f86061Oooo0o) {
            return (T) clone().OooOooo(cls, interfaceC25123OooOOO0, z);
        }
        C21929Ooooo0o.OooO0O0(interfaceC25123OooOOO0);
        this.f86055Oooo0.put(cls, interfaceC25123OooOOO0);
        int i = this.f86047OooOo0o;
        this.f86057Oooo00O = true;
        this.f86047OooOo0o = 67584 | i;
        this.f86063Oooo0oO = false;
        if (z) {
            this.f86047OooOo0o = i | 198656;
            this.f86056Oooo000 = true;
        }
        OooOoO();
        return this;
    }

    public T Oooo000(InterfaceC25123OooOOO0<Bitmap> interfaceC25123OooOOO0) {
        return (T) Oooo00O(interfaceC25123OooOOO0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T Oooo00O(InterfaceC25123OooOOO0<Bitmap> interfaceC25123OooOOO0, boolean z) {
        if (this.f86061Oooo0o) {
            return (T) clone().Oooo00O(interfaceC25123OooOOO0, z);
        }
        C25220OooOOOo c25220OooOOOo = new C25220OooOOOo(interfaceC25123OooOOO0, z);
        OooOooo(Bitmap.class, interfaceC25123OooOOO0, z);
        OooOooo(Drawable.class, c25220OooOOOo, z);
        OooOooo(BitmapDrawable.class, c25220OooOOOo, z);
        OooOooo(o00o00.OooO0OO.class, new o00o00.OooO0o(interfaceC25123OooOOO0), z);
        OooOoO();
        return this;
    }

    public final AbstractC25285OooO00o Oooo00o(OooOOO0 oooOOO0, o00o000.OooO0o oooO0o) {
        if (this.f86061Oooo0o) {
            return clone().Oooo00o(oooOOO0, oooO0o);
        }
        OooO0oo(oooOOO0);
        return Oooo000(oooO0o);
    }

    public T Oooo0O0(InterfaceC25123OooOOO0<Bitmap>... interfaceC25123OooOOO0Arr) {
        if (interfaceC25123OooOOO0Arr.length > 1) {
            return (T) Oooo00O(new C25118OooO0oO(interfaceC25123OooOOO0Arr), true);
        }
        if (interfaceC25123OooOOO0Arr.length == 1) {
            return (T) Oooo000(interfaceC25123OooOOO0Arr[0]);
        }
        OooOoO();
        return this;
    }

    public AbstractC25285OooO00o Oooo0o0() {
        if (this.f86061Oooo0o) {
            return clone().Oooo0o0();
        }
        this.f86064Oooo0oo = true;
        this.f86047OooOo0o |= 1048576;
        OooOoO();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC25285OooO00o) {
            return OooOO0O((AbstractC25285OooO00o) obj);
        }
        return false;
    }

    public int hashCode() {
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        return C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oO(0, C25316OooOO0o.OooO0oO(0, C25316OooOO0o.OooO0oO(this.f86057Oooo00O ? 1 : 0, C25316OooOO0o.OooO0oO(this.f86056Oooo000 ? 1 : 0, C25316OooOO0o.OooO0oO(this.f86053OooOooO, C25316OooOO0o.OooO0oO(this.f86051OooOoo, C25316OooOO0o.OooO0oO(this.f86052OooOoo0 ? 1 : 0, C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oO(0, C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oO(this.f86050OooOoOO, C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oO(0, C25316OooOO0o.OooO0oO(Float.floatToIntBits(1.0f), 17)), null)), this.f86048OooOoO)), null)))))))), this.f86046OooOo), this.f86049OooOoO0), this.f86058Oooo00o), this.f86055Oooo0), this.f86059Oooo0O0), this.f86054OooOooo), this.f86062Oooo0o0);
    }
}
