package o0OOO0oo;

import com.orion.notein.data.p602db.entity.StickerCollectionEntity;
import com.orion.notein.data.p602db.entity.StickerEntity;
import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import o0OOo0o.C27518o00o00O0;
import o0OOo0o.C27529o00o0OO0;
import o0OOo0o.C27534o00o0OoO;
import o0OOo0o.C27535o00o0Ooo;
import o0OOo0o.C27537o00o0o00;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOO0oo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27076OooOOOO implements InterfaceC27321Oooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27073OooOO0o f94258OooO00o;

    public C27076OooOOOO(C27073OooOO0o c27073OooOO0o) {
        this.f94258OooO00o = c27073OooOO0o;
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return this.f94258OooO00o.OooO0Oo(str, str2, abstractC32479OooO0OO);
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final C27072OooOO0O OooO00o(String parentId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parentId, "parentId");
        C27073OooOO0o c27073OooOO0o = this.f94258OooO00o;
        return new C27072OooOO0O(c27073OooOO0o.f94245OooO00o.OooO00o(parentId), c27073OooOO0o);
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooO0O0(ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27073OooOO0o c27073OooOO0o = this.f94258OooO00o;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27063OooO00o(arrayList, c27073OooOO0o, null), abstractC32479OooO0OO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o != enumC32485OooO00o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o == enumC32485OooO00o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooO0OO(C27529o00o0OO0 c27529o00o0OO0) {
        return this.f94258OooO00o.OooO0o0(c27529o00o0OO0);
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooO0Oo(String str, String str2, AbstractC32476OooO abstractC32476OooO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27075OooOOO0(this, str, str2, null), abstractC32476OooO);
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooO0o(List list, String str, C27537o00o0o00 c27537o00o0o00) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27074OooOOO(this, list, str, null), c27537o00o0o00);
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooO0o0(C27534o00o0OoO c27534o00o0OoO) {
        C27073OooOO0o c27073OooOO0o = this.f94258OooO00o;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27065OooO0OO(c27073OooOO0o, null), c27534o00o0OoO);
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final C27067OooO0o OooO0oO(String userId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        C27073OooOO0o c27073OooOO0o = this.f94258OooO00o;
        return new C27067OooO0o(c27073OooOO0o.f94246OooO0O0.OooO00o(userId), c27073OooOO0o);
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooO0oo(ArrayList arrayList, String str, C27535o00o0Ooo c27535o00o0Ooo) {
        Object objOooO0o0 = this.f94258OooO00o.f94245OooO00o.OooO0o0(arrayList, str, c27535o00o0Ooo);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o0 != enumC32485OooO00o) {
            objOooO0o0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o0 == enumC32485OooO00o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooOO0(String str, AbstractC32476OooO abstractC32476OooO) {
        Object objOooO00o = this.f94258OooO00o.OooO00o(str, abstractC32476OooO);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooOO0O(StickerCollection stickerCollection, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27073OooOO0o c27073OooOO0o = this.f94258OooO00o;
        Object objOooO0o0 = c27073OooOO0o.f94246OooO0O0.OooO0o0(new StickerCollectionEntity[]{c27073OooOO0o.f94247OooO0OO.toStickerCollectionEntity(stickerCollection)}, abstractC32479OooO0OO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o0 != enumC32485OooO00o) {
            objOooO0o0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o0 == enumC32485OooO00o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooOO0o(C27518o00o00O0 c27518o00o00O0) {
        C27073OooOO0o c27073OooOO0o = this.f94258OooO00o;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27070OooO0oo(c27073OooOO0o, null), c27518o00o00O0);
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Object OooOOO(ArrayList arrayList, AbstractC32476OooO abstractC32476OooO) {
        C27073OooOO0o c27073OooOO0o = this.f94258OooO00o;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c27073OooOO0o.f94247OooO0OO.toStickerEntity((Sticker) it.next()));
        }
        StickerEntity[] stickerEntityArr = (StickerEntity[]) arrayList2.toArray(new StickerEntity[0]);
        Object objOooO0O0 = c27073OooOO0o.f94245OooO00o.OooO0O0((StickerEntity[]) Arrays.copyOf(stickerEntityArr, stickerEntityArr.length), abstractC32476OooO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27321Oooo0o
    public final Serializable OooOOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return this.f94258OooO00o.OooO0O0(str, abstractC32479OooO0OO);
    }
}
