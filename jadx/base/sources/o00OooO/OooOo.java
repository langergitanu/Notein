package o00OooO;

import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o00Ooo0o.EnumC25112OooO00o;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00Ooo0o.InterfaceC25123OooOOO0;
import o00OoooO.InterfaceC25186OooOOo;
import o00o00o.C25277OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOo implements InterfaceC25130OooO0oo, InterfaceC22255OooO0Oo.OooO00o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO<?> f85570OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOO0 f85571OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f85572OooOoO = -1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f85573OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public InterfaceC25116OooO0o f85574OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f85575OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public List<InterfaceC25186OooOOo<File, ?>> f85576OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile InterfaceC25186OooOOo.OooO00o<?> f85577OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public File f85578OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C25147OooOoO0 f85579Oooo000;

    public OooOo(OooO oooO, OooOO0 oooOO02) {
        this.f85570OooOo = oooO;
        this.f85571OooOo0o = oooOO02;
    }

    @Override // o00OooO.InterfaceC25130OooO0oo
    public final boolean OooO00o() {
        List<Class<?>> list;
        ArrayList arrayListOooO0OO;
        ArrayList arrayListOooO00o = this.f85570OooOo.OooO00o();
        boolean z = false;
        if (!arrayListOooO00o.isEmpty()) {
            OooO<?> oooO = this.f85570OooOo;
            com.bumptech.glide.OooO oooOOooO00o = oooO.f85395OooO0OO.OooO00o();
            Class<?> cls = oooO.f85396OooO0Oo.getClass();
            Class<?> cls2 = oooO.f85399OooO0oO;
            Class<?> cls3 = oooO.f85402OooOO0O;
            C25277OooO0Oo c25277OooO0Oo = oooOOooO00o.f67109OooO0oo;
            o00o0O0.OooOO0O andSet = c25277OooO0Oo.f86029OooO00o.getAndSet(null);
            if (andSet == null) {
                andSet = new o00o0O0.OooOO0O(cls, cls2, cls3);
            } else {
                andSet.f86156OooO00o = cls;
                andSet.f86157OooO0O0 = cls2;
                andSet.f86158OooO0OO = cls3;
            }
            synchronized (c25277OooO0Oo.f86030OooO0O0) {
                list = c25277OooO0Oo.f86030OooO0O0.get(andSet);
            }
            c25277OooO0Oo.f86029OooO00o.set(andSet);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                o00OoooO.OooOo00 oooOo00 = oooOOooO00o.f67102OooO00o;
                synchronized (oooOo00) {
                    arrayListOooO0OO = oooOo00.f85748OooO00o.OooO0OO(cls);
                }
                Iterator it = arrayListOooO0OO.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : oooOOooO00o.f67104OooO0OO.OooO0O0((Class) it.next(), cls2)) {
                        if (!oooOOooO00o.f67106OooO0o.OooO00o(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C25277OooO0Oo c25277OooO0Oo2 = oooOOooO00o.f67109OooO0oo;
                List<Class<?>> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (c25277OooO0Oo2.f86030OooO0O0) {
                    c25277OooO0Oo2.f86030OooO0O0.put(new o00o0O0.OooOO0O(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List<InterfaceC25186OooOOo<File, ?>> list3 = this.f85576OooOoo0;
                    if (list3 != null && this.f85575OooOoo < list3.size()) {
                        this.f85577OooOooO = null;
                        while (!z && this.f85575OooOoo < this.f85576OooOoo0.size()) {
                            List<InterfaceC25186OooOOo<File, ?>> list4 = this.f85576OooOoo0;
                            int i = this.f85575OooOoo;
                            this.f85575OooOoo = i + 1;
                            InterfaceC25186OooOOo<File, ?> interfaceC25186OooOOo = list4.get(i);
                            File file = this.f85578OooOooo;
                            OooO<?> oooO2 = this.f85570OooOo;
                            this.f85577OooOooO = interfaceC25186OooOOo.OooO00o(file, oooO2.f85398OooO0o0, oooO2.f85397OooO0o, oooO2.f85392OooO);
                            if (this.f85577OooOooO != null && this.f85570OooOo.OooO0OO(this.f85577OooOooO.f85731OooO0OO.OooO00o()) != null) {
                                this.f85577OooOooO.f85731OooO0OO.OooO0Oo(this.f85570OooOo.f85406OooOOOO, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.f85572OooOoO + 1;
                    this.f85572OooOoO = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f85573OooOoO0 + 1;
                        this.f85573OooOoO0 = i3;
                        if (i3 >= arrayListOooO00o.size()) {
                            break;
                        }
                        this.f85572OooOoO = 0;
                    }
                    InterfaceC25116OooO0o interfaceC25116OooO0o = (InterfaceC25116OooO0o) arrayListOooO00o.get(this.f85573OooOoO0);
                    Class cls5 = (Class) list2.get(this.f85572OooOoO);
                    InterfaceC25123OooOOO0<Z> interfaceC25123OooOOO0OooO0o0 = this.f85570OooOo.OooO0o0(cls5);
                    OooO<?> oooO3 = this.f85570OooOo;
                    this.f85579Oooo000 = new C25147OooOoO0(oooO3.f85395OooO0OO.f67122OooO00o, interfaceC25116OooO0o, oooO3.f85404OooOOO, oooO3.f85398OooO0o0, oooO3.f85397OooO0o, interfaceC25123OooOOO0OooO0o0, cls5, oooO3.f85392OooO);
                    File fileOooO0O0 = oooO3.f85400OooO0oo.OooO00o().OooO0O0(this.f85579Oooo000);
                    this.f85578OooOooo = fileOooO0O0;
                    if (fileOooO0O0 != null) {
                        this.f85574OooOoOO = interfaceC25116OooO0o;
                        this.f85576OooOoo0 = this.f85570OooOo.f85395OooO0OO.OooO00o().OooO0o(fileOooO0O0);
                        this.f85575OooOoo = 0;
                    }
                }
            } else if (!File.class.equals(this.f85570OooOo.f85402OooOO0O)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f85570OooOo.f85396OooO0Oo.getClass() + " to " + this.f85570OooOo.f85402OooOO0O);
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo.OooO00o
    public final void OooO0o(Exception exc) {
        this.f85571OooOo0o.OooO0Oo(this.f85579Oooo000, exc, this.f85577OooOooO.f85731OooO0OO, EnumC25112OooO00o.f85371OooOoO);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo.OooO00o
    public final void OooO0o0(Object obj) {
        this.f85571OooOo0o.OooO0OO(this.f85574OooOoOO, obj, this.f85577OooOooO.f85731OooO0OO, EnumC25112OooO00o.f85371OooOoO, this.f85579Oooo000);
    }

    @Override // o00OooO.InterfaceC25130OooO0oo
    public final void cancel() {
        InterfaceC25186OooOOo.OooO00o<?> oooO00o = this.f85577OooOooO;
        if (oooO00o != null) {
            oooO00o.f85731OooO0OO.cancel();
        }
    }
}
