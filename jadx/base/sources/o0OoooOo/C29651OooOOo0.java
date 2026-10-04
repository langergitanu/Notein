package o0OoooOo;

import java.util.Comparator;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OoooOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29651OooOOo0 implements Comparator {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32508OooOOOo f105128OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105129OooOo0o;

    public /* synthetic */ C29651OooOOo0(InterfaceC32508OooOOOo interfaceC32508OooOOOo, int i) {
        this.f105129OooOo0o = i;
        this.f105128OooOo = interfaceC32508OooOOOo;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f105129OooOo0o) {
        }
        return ((Number) ((C29649OooOOOo) this.f105128OooOo).invoke(obj, obj2)).intValue();
    }
}
