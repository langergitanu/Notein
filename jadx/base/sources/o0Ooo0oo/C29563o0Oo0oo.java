package o0Ooo0oo;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Ooo0oo.o0Oo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$favoritePenVOList$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29563o0Oo0oo extends AbstractC32476OooO implements InterfaceC32511OooOOoo<FavoriteToolBox.OooO00o, List<? extends PenInfo>, Integer, PenInfo, Continuation<? super List<? extends FavoritePenVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f104871OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ FavoriteToolBox.OooO00o f104872OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ PenInfo f104873OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ int f104874OooOoO0;

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        int iIntValue = ((Number) obj3).intValue();
        C29563o0Oo0oo c29563o0Oo0oo = new C29563o0Oo0oo(5, (Continuation) serializable);
        c29563o0Oo0oo.f104872OooOo0o = (FavoriteToolBox.OooO00o) obj;
        c29563o0Oo0oo.f104871OooOo = (List) obj2;
        c29563o0Oo0oo.f104874OooOoO0 = iIntValue;
        c29563o0Oo0oo.f104873OooOoO = (PenInfo) obj4;
        return c29563o0Oo0oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        FavoriteToolBox.OooO00o oooO00o = this.f104872OooOo0o;
        List list = this.f104871OooOo;
        int i = this.f104874OooOoO0;
        PenInfo penInfo = this.f104873OooOoO;
        if (oooO00o == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        boolean z = i == 0;
        int i2 = z ? 20 : 3;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            PenInfo penInfo2 = (PenInfo) obj2;
            if (penInfo2.getType() != 3 || penInfo2.getExtra().containsKey(C18437z2.f56754h)) {
                if (penInfo2.getType() != 8 || penInfo2.getExtra().containsKey(C18437z2.f56754h)) {
                    arrayList.add(obj2);
                }
            }
        }
        ArrayList<PenInfo> arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            PenInfo penInfo3 = (PenInfo) obj3;
            if (z || penInfo3.getType() != 8) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
        for (PenInfo penInfo4 : arrayList2) {
            PenInfo penInfoCopy$default = PenInfo.copy$default(penInfo4, null, 0, 0, 0, null, null, null, penInfo != null ? penInfo.hasSamePenSettings(penInfo4) : false, null, 383, null);
            int type = penInfo4.getType();
            arrayList3.add(new FavoritePenVO(penInfoCopy$default, type != 3 ? type != 4 ? type != 7 ? type != 8 ? null : penInfo4.getExtra().getString(C18437z2.f56754h, "") : penInfo4.getExtra().getString(C18437z2.f56754h, "line") : penInfo4.getExtra().getString(C18437z2.f56754h, "") : penInfo4.getExtra().getString(C18437z2.f56754h, "-1"), oooO00o.f76903OooO0O0));
        }
        return oOo000Oo.OooOo.o00Oo0(arrayList3, i2);
    }
}
