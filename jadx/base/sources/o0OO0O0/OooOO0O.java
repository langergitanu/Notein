package o0OO0O0;

import com.orion.notein.data.p602db.entity.AudioSyncRecordEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.audio.AudioLocalDataSource$getAudioSyncRecordsByDisplayItemIds$2", m80623f = "AudioLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.OooOo00, Continuation<? super List<? extends AudioSyncRecordEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Set<String> f92220OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92221OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(Set<String> set, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f92220OooOo = set;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOO0O oooOO0O = new OooOO0O(this.f92220OooOo, continuation);
        oooOO0O.f92221OooOo0o = obj;
        return oooOO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.OooOo00 oooOo00, Continuation<? super List<? extends AudioSyncRecordEntity>> continuation) {
        return ((OooOO0O) create(oooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        oo0oO0.OooOo00 oooOo00 = (oo0oO0.OooOo00) this.f92221OooOo0o;
        ArrayList arrayListOooo00O = oOo000Oo.OooOo.Oooo00O(this.f92220OooOo, 100);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListOooo00O.iterator();
        while (it.hasNext()) {
            C34431OooOo0.OooOo0o(arrayList, oooOo00.OooOO0o((List) it.next()));
        }
        return arrayList;
    }
}
