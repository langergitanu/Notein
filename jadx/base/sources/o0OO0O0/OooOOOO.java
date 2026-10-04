package o0OO0O0;

import com.orion.notein.data.p602db.entity.AudioSyncRecordDisplayItemIdEntity;
import com.orion.notein.data.p602db.entity.AudioSyncRecordEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.audio.AudioLocalDataSource$replaceAudioSyncRecordIds$2", m80623f = "AudioLocalDataSource.kt", m80624l = {212}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.OooOo00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92230OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92231OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f92232OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(Map<String, String> map, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f92232OooOoO0 = map;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOOOO oooOOOO = new OooOOOO(this.f92232OooOoO0, continuation);
        oooOOOO.f92230OooOo = obj;
        return oooOOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.OooOo00 oooOo00, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOOO) create(oooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92231OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo0oO0.OooOo00 oooOo00 = (oo0oO0.OooOo00) this.f92230OooOo;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, String> map = this.f92232OooOoO0;
            ArrayList arrayListOooo00O = oOo000Oo.OooOo.Oooo00O(map.keySet(), 100);
            ArrayList<AudioSyncRecordEntity> arrayList = new ArrayList();
            Iterator it = arrayListOooo00O.iterator();
            while (it.hasNext()) {
                C34431OooOo0.OooOo0o(arrayList, oooOo00.OooOO0o((List) it.next()));
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            for (AudioSyncRecordEntity audioSyncRecordEntity : arrayList) {
                String id = audioSyncRecordEntity.getId();
                String displayItemId = map.get(audioSyncRecordEntity.getDisplayItemId());
                if (displayItemId == null) {
                    displayItemId = audioSyncRecordEntity.getDisplayItemId();
                }
                arrayList2.add(new AudioSyncRecordDisplayItemIdEntity(id, displayItemId, jCurrentTimeMillis, audioSyncRecordEntity.getDeleted()));
            }
            AudioSyncRecordDisplayItemIdEntity[] audioSyncRecordDisplayItemIdEntityArr = (AudioSyncRecordDisplayItemIdEntity[]) arrayList2.toArray(new AudioSyncRecordDisplayItemIdEntity[0]);
            AudioSyncRecordDisplayItemIdEntity[] audioSyncRecordDisplayItemIdEntityArr2 = (AudioSyncRecordDisplayItemIdEntity[]) Arrays.copyOf(audioSyncRecordDisplayItemIdEntityArr, audioSyncRecordDisplayItemIdEntityArr.length);
            this.f92231OooOo0o = 1;
            if (oooOo00.OooO0O0(audioSyncRecordDisplayItemIdEntityArr2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
