package OooOooo;

import java.util.List;
import oO0O000o.InterfaceC32511OooOOoo;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34641OooOo0O;

/* JADX INFO: renamed from: OooOooo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20781Oooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC20779OooOooO f59670OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f59671OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final EnumC20804OooooO0 f59672OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC20742OooO f59673OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AbstractC34655Oooo0o[] f59674OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<InterfaceC34641OooOo0O> f59675OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C20794OoooO00[] f59676OooO0oO;

    /* JADX WARN: Multi-variable type inference failed */
    public C20781Oooo(EnumC20779OooOooO enumC20779OooOooO, InterfaceC32511OooOOoo interfaceC32511OooOOoo, float f, AbstractC20742OooO abstractC20742OooO, List list, AbstractC34655Oooo0o[] abstractC34655Oooo0oArr) {
        EnumC20804OooooO0 enumC20804OooooO0 = EnumC20804OooooO0.f59729OooOo0o;
        this.f59670OooO00o = enumC20779OooOooO;
        this.f59671OooO0O0 = (kotlin.jvm.internal.OooOOOO) interfaceC32511OooOOoo;
        this.f59672OooO0OO = enumC20804OooooO0;
        this.f59673OooO0Oo = abstractC20742OooO;
        this.f59675OooO0o0 = list;
        this.f59674OooO0o = abstractC34655Oooo0oArr;
        int size = list.size();
        C20794OoooO00[] c20794OoooO00Arr = new C20794OoooO00[size];
        for (int i = 0; i < size; i++) {
            c20794OoooO00Arr[i] = C20790Oooo0oO.OooO0OO(this.f59675OooO0o0.get(i));
        }
        this.f59676OooO0oO = c20794OoooO00Arr;
    }

    public final int OooO00o(AbstractC34655Oooo0o abstractC34655Oooo0o) {
        return this.f59670OooO00o == EnumC20779OooOooO.f59666OooOo0o ? abstractC34655Oooo0o.f124844OooOo : abstractC34655Oooo0o.f124845OooOo0o;
    }

    public final int OooO0O0(AbstractC34655Oooo0o abstractC34655Oooo0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34655Oooo0o, "<this>");
        return this.f59670OooO00o == EnumC20779OooOooO.f59666OooOo0o ? abstractC34655Oooo0o.f124845OooOo0o : abstractC34655Oooo0o.f124844OooOo;
    }
}
