package o0Oo0o00;

import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32466OooO0OO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0Oo0o00.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$_syncFileTitleMap$1", m80623f = "CloudSyncViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28202OooooOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends CloudMetaRemote>, Map<String, ? extends String>, Continuation<? super Map<String, ? extends String>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Map f99972OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f99973OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends CloudMetaRemote> list, Map<String, ? extends String> map, Continuation<? super Map<String, ? extends String>> continuation) {
        C28202OooooOO c28202OooooOO = new C28202OooooOO(3, continuation);
        c28202OooooOO.f99973OooOo0o = list;
        c28202OooooOO.f99972OooOo = map;
        return c28202OooooOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List<CloudMetaRemote> list = this.f99973OooOo0o;
        Map map = this.f99972OooOo;
        C32466OooO0OO c32466OooO0OO = new C32466OooO0OO();
        c32466OooO0OO.putAll(map);
        for (CloudMetaRemote cloudMetaRemote : list) {
            String title = cloudMetaRemote.getExtra().getTitle();
            if (title != null) {
                if (title.length() <= 0) {
                    title = null;
                }
                if (title != null) {
                    c32466OooO0OO.put(cloudMetaRemote.getId(), title);
                }
            }
        }
        return c32466OooO0OO.OooO0O0();
    }
}
