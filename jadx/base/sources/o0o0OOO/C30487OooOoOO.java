package o0o0OOO;

import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0o0OOO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30487OooOoOO<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ MyTemplateFragment f108872OooOo0o;

    public C30487OooOoOO(MyTemplateFragment myTemplateFragment) {
        this.f108872OooOo0o = myTemplateFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String str = (String) ((C32443OooOOO) t).f116638OooOo0o;
        this.f108872OooOo0o.getClass();
        return C24536OooO0Oo.OooO0O0(MyTemplateFragment.Oooo0OO(str), MyTemplateFragment.Oooo0OO((String) ((C32443OooOOO) t2).f116638OooOo0o));
    }
}
