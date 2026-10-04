package o0OO00o0;

import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO00o0.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkRefLocalDataSource$updateOldNoteId$2", m80623f = "DualLinkRefLocalDataSource.kt", m80624l = {99}, m80625m = "invokeSuspend")
public final class C26499Oooo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.oo000o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91084OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91085OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f91086OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91087OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26499Oooo0o(String str, String str2, Continuation<? super C26499Oooo0o> continuation) {
        super(2, continuation);
        this.f91087OooOoO0 = str;
        this.f91086OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26499Oooo0o c26499Oooo0o = new C26499Oooo0o(this.f91087OooOoO0, this.f91086OooOoO, continuation);
        c26499Oooo0o.f91084OooOo = obj;
        return c26499Oooo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.oo000o oo000oVar, Continuation<? super C32460OooOooO> continuation) {
        return ((C26499Oooo0o) create(oo000oVar, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91085OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo0oO0.oo000o oo000oVar = (oo0oO0.oo000o) this.f91084OooOo;
            List<DualLinkRefEntity> listOooO0o0 = oo000oVar.OooO0o0(this.f91087OooOoO0);
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0o0, 10));
            for (DualLinkRefEntity dualLinkRefEntity : listOooO0o0) {
                arrayList.add(dualLinkRefEntity.copy((8189 & 1) != 0 ? dualLinkRefEntity.id : null, (8189 & 2) != 0 ? dualLinkRefEntity.noteId : this.f91086OooOoO, (8189 & 4) != 0 ? dualLinkRefEntity.pageId : null, (8189 & 8) != 0 ? dualLinkRefEntity.bounds : null, (8189 & 16) != 0 ? dualLinkRefEntity.itemId : null, (8189 & 32) != 0 ? dualLinkRefEntity.dualLinkSourceId : null, (8189 & 64) != 0 ? dualLinkRefEntity.dualLinkSourceNoteId : null, (8189 & 128) != 0 ? dualLinkRefEntity.creationTime : 0L, (8189 & 256) != 0 ? dualLinkRefEntity.lastModificationTime : 0L, (8189 & 512) != 0 ? dualLinkRefEntity.left : null, (8189 & 1024) != 0 ? dualLinkRefEntity.top : null, (8189 & 2048) != 0 ? dualLinkRefEntity.right : null, (8189 & 4096) != 0 ? dualLinkRefEntity.bottom : null));
            }
            DualLinkRefEntity[] dualLinkRefEntityArr = (DualLinkRefEntity[]) arrayList.toArray(new DualLinkRefEntity[0]);
            DualLinkRefEntity[] dualLinkRefEntityArr2 = (DualLinkRefEntity[]) Arrays.copyOf(dualLinkRefEntityArr, dualLinkRefEntityArr.length);
            this.f91085OooOo0o = 1;
            if (oo000oVar.OooO0oo(dualLinkRefEntityArr2, this) == enumC32485OooO00o) {
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
