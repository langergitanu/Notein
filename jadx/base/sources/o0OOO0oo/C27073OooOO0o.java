package o0OOO0oo;

import OooOoOO.C20519OooO0Oo;
import com.facebook.soloader.OooOo;
import com.orion.notein.data.p602db.entity.StickerCollectionEntity;
import com.orion.notein.data.p602db.entity.StickerEntity;
import com.orion.notein.domain.mapper.StickerMapper;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o000OO00.C24460OooOOoo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34975o00ooooO;
import oo0oO0.o0O000;

/* JADX INFO: renamed from: o0OOO0oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27073OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O000 f94245OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC34975o00ooooO f94246OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StickerMapper f94247OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f94248OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C32447OooOOo f94249OooO0o0;

    public C27073OooOO0o(o0O000 stickerDao, InterfaceC34975o00ooooO stickerCollectionDao, StickerMapper mapper, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stickerDao, "stickerDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stickerCollectionDao, "stickerCollectionDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f94245OooO00o = stickerDao;
        this.f94246OooO0O0 = stickerCollectionDao;
        this.f94247OooO0OO = mapper;
        this.f94248OooO0Oo = abstractApplicationC26277OooOoOO;
        this.f94249OooO0o0 = C20519OooO0Oo.OooO0OO(new C24460OooOOoo(2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r7.OooO0OO(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27064OooO0O0 c27064OooO0O0;
        C27073OooOO0o c27073OooOO0o;
        if (abstractC32479OooO0OO instanceof C27064OooO0O0) {
            c27064OooO0O0 = (C27064OooO0O0) abstractC32479OooO0OO;
            int i = c27064OooO0O0.f94213OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27064OooO0O0.f94213OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27064OooO0O0 = new C27064OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27064OooO0O0.f94212OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27064OooO0O0.f94213OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27064OooO0O0.f94210OooOo0o = this;
            c27064OooO0O0.f94209OooOo = str;
            c27064OooO0O0.f94213OooOoOO = 1;
            if (this.f94246OooO0O0.OooO0O0(str, c27064OooO0O0) != enumC32485OooO00o) {
                c27073OooOO0o = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = c27064OooO0O0.f94209OooOo;
        c27073OooOO0o = c27064OooO0O0.f94210OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        o0O000 o0o0002 = c27073OooOO0o.f94245OooO00o;
        c27064OooO0O0.f94210OooOo0o = null;
        c27064OooO0O0.f94209OooOo = null;
        c27064OooO0O0.f94213OooOoOO = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27066OooO0Oo c27066OooO0Oo;
        C27073OooOO0o c27073OooOO0o;
        if (abstractC32479OooO0OO instanceof C27066OooO0Oo) {
            c27066OooO0Oo = (C27066OooO0Oo) abstractC32479OooO0OO;
            int i = c27066OooO0Oo.f94217OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27066OooO0Oo.f94217OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27066OooO0Oo = new C27066OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27066OooO0Oo.f94215OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27066OooO0Oo.f94217OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c27066OooO0Oo.f94216OooOo0o = this;
            c27066OooO0Oo.f94217OooOoO = 1;
            objOooO0OO = this.f94246OooO0O0.OooO0OO(str, c27066OooO0Oo);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27073OooOO0o = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27073OooOO0o = c27066OooO0Oo.f94216OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
        }
        Iterable iterable = (Iterable) objOooO0OO;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c27073OooOO0o.f94247OooO0OO.toStickerCollection((StickerCollectionEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27068OooO0o0 c27068OooO0o0;
        if (abstractC32479OooO0OO instanceof C27068OooO0o0) {
            c27068OooO0o0 = (C27068OooO0o0) abstractC32479OooO0OO;
            int i = c27068OooO0o0.f94228OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27068OooO0o0.f94228OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27068OooO0o0 = new C27068OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27068OooO0o0.f94227OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27068OooO0o0.f94228OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            List listOooO0oO = OooOo.OooO0oO(str);
            c27068OooO0o0.f94228OooOoO0 = 1;
            objOooO0o = OooO0o(str2, listOooO0oO, c27068OooO0o0);
            if (objOooO0o == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return oOo000Oo.OooOo.Oooo((List) objOooO0o);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27069OooO0oO c27069OooO0oO;
        C27073OooOO0o c27073OooOO0o;
        if (abstractC32479OooO0OO instanceof C27069OooO0oO) {
            c27069OooO0oO = (C27069OooO0oO) abstractC32479OooO0OO;
            int i = c27069OooO0oO.f94231OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27069OooO0oO.f94231OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27069OooO0oO = new C27069OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27069OooO0oO.f94229OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27069OooO0oO.f94231OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27069OooO0oO.f94230OooOo0o = this;
            c27069OooO0oO.f94231OooOoO = 1;
            objOooO0o = this.f94246OooO0O0.OooO0o(str, str2, c27069OooO0oO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27073OooOO0o = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27073OooOO0o = c27069OooO0oO.f94230OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        StickerCollectionEntity stickerCollectionEntity = (StickerCollectionEntity) objOooO0o;
        if (stickerCollectionEntity != null) {
            return c27073OooOO0o.f94247OooO0OO.toStickerCollection(stickerCollectionEntity);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27071OooOO0 c27071OooOO0;
        C27073OooOO0o c27073OooOO0o;
        if (abstractC32479OooO0OO instanceof C27071OooOO0) {
            c27071OooOO0 = (C27071OooOO0) abstractC32479OooO0OO;
            int i = c27071OooOO0.f94236OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27071OooOO0.f94236OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27071OooOO0 = new C27071OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27071OooOO0.f94234OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27071OooOO0.f94236OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27071OooOO0.f94235OooOo0o = this;
            c27071OooOO0.f94236OooOoO = 1;
            objOooO0Oo = this.f94245OooO00o.OooO0Oo(list, str, c27071OooOO0);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27073OooOO0o = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27073OooOO0o = c27071OooOO0.f94235OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
        }
        Iterable iterable = (Iterable) objOooO0Oo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c27073OooOO0o.f94247OooO0OO.toSticker((StickerEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27062OooO c27062OooO;
        File file;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        if (abstractC32479OooO0OO instanceof C27062OooO) {
            c27062OooO = (C27062OooO) abstractC32479OooO0OO;
            int i = c27062OooO.f94205OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27062OooO.f94205OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27062OooO = new C27062OooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27062OooO.f94204OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27062OooO.f94205OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            File file2 = new File(this.f94248OooO0Oo.getFilesDir(), "stickers");
            InterfaceC33895OooO00o interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) this.f94249OooO0o0.getValue();
            c27062OooO.f94202OooOo0o = file2;
            c27062OooO.f94201OooOo = interfaceC33895OooO00o2;
            c27062OooO.f94205OooOoOO = 1;
            if (interfaceC33895OooO00o2.OooO00o(c27062OooO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file = file2;
            interfaceC33895OooO00o = interfaceC33895OooO00o2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33895OooO00o = c27062OooO.f94201OooOo;
            file = c27062OooO.f94202OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            interfaceC33895OooO00o.OooOOO0(null);
            return file;
        } catch (Throwable th) {
            interfaceC33895OooO00o.OooOOO0(null);
            throw th;
        }
    }
}
