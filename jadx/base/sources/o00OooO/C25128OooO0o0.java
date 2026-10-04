package o00OooO;

import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.File;
import java.util.List;
import o00Ooo0o.EnumC25112OooO00o;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooO.InterfaceC25130OooO0oo;
import o00OoooO.InterfaceC25186OooOOo;

/* JADX INFO: renamed from: o00OooO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25128OooO0o0 implements InterfaceC25130OooO0oo, InterfaceC22255OooO0Oo.OooO00o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO<?> f85421OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final List<InterfaceC25116OooO0o> f85422OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f85423OooOoO = -1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC25130OooO0oo.OooO00o f85424OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public InterfaceC25116OooO0o f85425OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f85426OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public List<InterfaceC25186OooOOo<File, ?>> f85427OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile InterfaceC25186OooOOo.OooO00o<?> f85428OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public File f85429OooOooo;

    public C25128OooO0o0(List<InterfaceC25116OooO0o> list, OooO<?> oooO, InterfaceC25130OooO0oo.OooO00o oooO00o) {
        this.f85422OooOo0o = list;
        this.f85421OooOo = oooO;
        this.f85424OooOoO0 = oooO00o;
    }

    @Override // o00OooO.InterfaceC25130OooO0oo
    public final boolean OooO00o() {
        while (true) {
            List<InterfaceC25186OooOOo<File, ?>> list = this.f85427OooOoo0;
            boolean z = false;
            if (list != null && this.f85426OooOoo < list.size()) {
                this.f85428OooOooO = null;
                while (!z && this.f85426OooOoo < this.f85427OooOoo0.size()) {
                    List<InterfaceC25186OooOOo<File, ?>> list2 = this.f85427OooOoo0;
                    int i = this.f85426OooOoo;
                    this.f85426OooOoo = i + 1;
                    InterfaceC25186OooOOo<File, ?> interfaceC25186OooOOo = list2.get(i);
                    File file = this.f85429OooOooo;
                    OooO<?> oooO = this.f85421OooOo;
                    this.f85428OooOooO = interfaceC25186OooOOo.OooO00o(file, oooO.f85398OooO0o0, oooO.f85397OooO0o, oooO.f85392OooO);
                    if (this.f85428OooOooO != null && this.f85421OooOo.OooO0OO(this.f85428OooOooO.f85731OooO0OO.OooO00o()) != null) {
                        this.f85428OooOooO.f85731OooO0OO.OooO0Oo(this.f85421OooOo.f85406OooOOOO, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f85423OooOoO + 1;
            this.f85423OooOoO = i2;
            if (i2 >= this.f85422OooOo0o.size()) {
                return false;
            }
            InterfaceC25116OooO0o interfaceC25116OooO0o = this.f85422OooOo0o.get(this.f85423OooOoO);
            OooO<?> oooO2 = this.f85421OooOo;
            File fileOooO0O0 = oooO2.f85400OooO0oo.OooO00o().OooO0O0(new OooO0o(interfaceC25116OooO0o, oooO2.f85404OooOOO));
            this.f85429OooOooo = fileOooO0O0;
            if (fileOooO0O0 != null) {
                this.f85425OooOoOO = interfaceC25116OooO0o;
                this.f85427OooOoo0 = this.f85421OooOo.f85395OooO0OO.OooO00o().OooO0o(fileOooO0O0);
                this.f85426OooOoo = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo.OooO00o
    public final void OooO0o(Exception exc) {
        this.f85424OooOoO0.OooO0Oo(this.f85425OooOoOO, exc, this.f85428OooOooO.f85731OooO0OO, EnumC25112OooO00o.f85372OooOoO0);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo.OooO00o
    public final void OooO0o0(Object obj) {
        this.f85424OooOoO0.OooO0OO(this.f85425OooOoOO, obj, this.f85428OooOooO.f85731OooO0OO, EnumC25112OooO00o.f85372OooOoO0, this.f85425OooOoOO);
    }

    @Override // o00OooO.InterfaceC25130OooO0oo
    public final void cancel() {
        InterfaceC25186OooOOo.OooO00o<?> oooO00o = this.f85428OooOooO;
        if (oooO00o != null) {
            oooO00o.f85731OooO0OO.cancel();
        }
    }
}
