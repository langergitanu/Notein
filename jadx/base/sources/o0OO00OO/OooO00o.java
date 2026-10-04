package o0OO00OO;

import com.orion.notein.data.p602db.entity.cloudsync.CloudProviderConverters;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVOFilter;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo00O0O.OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO00o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90938OooOo0o;

    public /* synthetic */ OooO00o(int i) {
        this.f90938OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f90938OooOo0o) {
            case 0:
                return CloudProviderConverters.json$lambda$0((OooO0o) obj);
            default:
                return Boolean.valueOf(TiledPagePreviewVOFilter.getFilter$lambda$1((TiledPagePreviewVO) obj));
        }
    }
}
