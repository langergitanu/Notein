package androidx.lifecycle;

import androidx.lifecycle.o00Oo0;
import o000o00.C24556OooO0O0;
import o000o0O0.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o extends o00Oo0.C22020OooO0Oo implements o00Oo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000ooo0.OooO0OO f65504OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public AbstractC21979OooOOo0 f65505OooO0O0;

    @Override // androidx.lifecycle.o00Oo0.OooO0O0
    public final <T extends AbstractC22019Ooooooo> T OooO00o(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f65505OooO0O0 == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        o000ooo0.OooO0OO oooO0OO = this.f65504OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO);
        AbstractC21979OooOOo0 abstractC21979OooOOo0 = this.f65505OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC21979OooOOo0);
        C22010OoooOoo c22010OoooOooOooO0O0 = C21977OooOOOo.OooO0O0(oooO0OO, abstractC21979OooOOo0, canonicalName, null);
        OooOO0.OooO0OO oooO0OO2 = new OooOO0.OooO0OO(c22010OoooOooOooO0O0.f65651OooOo);
        oooO0OO2.OooO0Oo(c22010OoooOooOooO0O0, "androidx.lifecycle.savedstate.vm.tag");
        return oooO0OO2;
    }

    @Override // androidx.lifecycle.o00Oo0.OooO0O0
    public final AbstractC22019Ooooooo OooO0O0(Class cls, C24556OooO0O0 c24556OooO0O0) {
        String str = (String) c24556OooO0O0.f83135OooO00o.get(o00Ooo.f65689OooO00o);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        o000ooo0.OooO0OO oooO0OO = this.f65504OooO00o;
        if (oooO0OO == null) {
            return new OooOO0.OooO0OO(C22011Ooooo00.OooO00o(c24556OooO0O0));
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO);
        AbstractC21979OooOOo0 abstractC21979OooOOo0 = this.f65505OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC21979OooOOo0);
        C22010OoooOoo c22010OoooOooOooO0O0 = C21977OooOOOo.OooO0O0(oooO0OO, abstractC21979OooOOo0, str, null);
        OooOO0.OooO0OO oooO0OO2 = new OooOO0.OooO0OO(c22010OoooOooOooO0O0.f65651OooOo);
        oooO0OO2.OooO0Oo(c22010OoooOooOooO0O0, "androidx.lifecycle.savedstate.vm.tag");
        return oooO0OO2;
    }

    @Override // androidx.lifecycle.o00Oo0.C22020OooO0Oo
    public final void OooO0OO(AbstractC22019Ooooooo abstractC22019Ooooooo) {
        o000ooo0.OooO0OO oooO0OO = this.f65504OooO00o;
        if (oooO0OO != null) {
            AbstractC21979OooOOo0 abstractC21979OooOOo0 = this.f65505OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC21979OooOOo0);
            C21977OooOOOo.OooO00o(abstractC22019Ooooooo, oooO0OO, abstractC21979OooOOo0);
        }
    }
}
