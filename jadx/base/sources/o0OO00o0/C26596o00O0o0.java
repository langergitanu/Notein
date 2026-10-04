package o0OO00o0;

import Oooo0oO.C21111o0ooOoO;
import android.graphics.RectF;
import android.net.Uri;
import com.orion.notein.data.p602db.entity.ImageEntity;
import com.orion.notein.domain.mapper.ImageMapper;
import com.orion.notein.domain.models.page.Image;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0Oo.InterfaceC27303OooOOoo;
import o0OOo0o.C27419o000o00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO00o0.o00O0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26596o00O0o0 implements InterfaceC27303OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26588o00O00oO f91720OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ImageMapper f91721OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f91722OooO0OO;

    public C26596o00O0o0(C26588o00O00oO imageLocalDataSource, ImageMapper mapper, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageLocalDataSource, "imageLocalDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f91720OooO00o = imageLocalDataSource;
        this.f91721OooO0O0 = mapper;
        this.f91722OooO0OO = abstractApplicationC26277OooOoOO;
    }

    public final File OooO(String dstNoteId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dstNoteId, "dstNoteId");
        File file = new File(this.f91722OooO0OO.getFilesDir(), "images");
        if (!file.exists() || !file.isDirectory()) {
            file.mkdir();
        }
        File file2 = new File(file, dstNoteId);
        if (file2.exists() && file2.isDirectory()) {
            return file2;
        }
        file2.mkdir();
        return file2;
    }

    @Override // o0OOo0Oo.InterfaceC27303OooOOoo
    public final Object OooO0O0(List list, String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f91721OooO0O0.toEntity((Image) it.next()));
        }
        C26588o00O00oO c26588o00O00oO = this.f91720OooO00o;
        c26588o00O00oO.getClass();
        Object objOooO00o = c26588o00O00oO.OooO00o(str, new o00O0000(z, arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0OO(String str, C27419o000o00o c27419o000o00o) {
        C26588o00O00oO c26588o00O00oO = this.f91720OooO00o;
        c26588o00O00oO.getClass();
        Object objOooO00o = c26588o00O00oO.OooO00o(str, new o00(2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    public final C32460OooOooO OooO0Oo(String str) {
        C32501OooO0oO.OooO0Oo(OooO(str));
        return C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0o(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26588o00O00oO c26588o00O00oO = this.f91720OooO00o;
        c26588o00O00oO.getClass();
        Object objOooO00o = c26588o00O00oO.OooO00o(str2, new o00O000(str, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    public final C32460OooOooO OooO0o0(String str, ArrayList arrayList) {
        File fileOooO = OooO(str);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(new File((String) obj).getParent(), fileOooO.getAbsolutePath())) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            new File((String) it.next()).delete();
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(File file, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo00o oo00oVar;
        if (abstractC32479OooO0OO instanceof oo00o) {
            oo00oVar = (oo00o) abstractC32479OooO0OO;
            int i = oo00oVar.f92171OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo00oVar.f92171OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oo00oVar = new oo00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oo00oVar.f92170OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo00oVar.f92171OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            o00O0 o00o02 = new o00O0(this, str, str2, file, null);
            oo00oVar.f92171OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, o00o02, oo00oVar);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00O0O00 o00o0o002;
        C26596o00O0o0 c26596o00O0o0;
        if (abstractC32479OooO0OO instanceof o00O0O00) {
            o00o0o002 = (o00O0O00) abstractC32479OooO0OO;
            int i = o00o0o002.f91681OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o0o002.f91681OooOoO = i - Integer.MIN_VALUE;
            } else {
                o00o0o002 = new o00O0O00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o00o0o002.f91679OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00o0o002.f91681OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            o00o0o002.f91680OooOo0o = this;
            o00o0o002.f91681OooOoO = 1;
            C26588o00O00oO c26588o00O00oO = this.f91720OooO00o;
            c26588o00O00oO.getClass();
            objOooO00o = c26588o00O00oO.OooO00o(str2, new o00O000o(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26596o00O0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26596o00O0o0 = o00o0o002.f91680OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        return c26596o00O0o0.f91721OooO0O0.toImage((ImageEntity) objOooO00o);
    }

    public final File OooOO0(String dstNoteId, String dstImageId, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dstNoteId, "dstNoteId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dstImageId, "dstImageId");
        if (z) {
            dstImageId = dstImageId.concat(".svg");
        } else if (!C33595OooOOo.OooOOo0(dstImageId, ".png", false)) {
            dstImageId = dstImageId.concat(".png");
        }
        return new File(OooO(dstNoteId), dstImageId);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOO0O(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00O0O0O o00o0o0o2;
        C26596o00O0o0 c26596o00O0o0;
        if (abstractC32479OooO0OO instanceof o00O0O0O) {
            o00o0o0o2 = (o00O0O0O) abstractC32479OooO0OO;
            int i = o00o0o0o2.f91685OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o0o0o2.f91685OooOoO = i - Integer.MIN_VALUE;
            } else {
                o00o0o0o2 = new o00O0O0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o00o0o0o2.f91683OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00o0o0o2.f91685OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            o00o0o0o2.f91684OooOo0o = this;
            o00o0o0o2.f91685OooOoO = 1;
            C26588o00O00oO c26588o00O00oO = this.f91720OooO00o;
            c26588o00O00oO.getClass();
            objOooO00o = c26588o00O00oO.OooO00o(str, new o00O00(arrayList, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26596o00O0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26596o00O0o0 = o00o0o0o2.f91684OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(c26596o00O0o0.f91721OooO0O0.toImage((ImageEntity) it.next()));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26589o00O0O0o c26589o00O0O0o;
        C26596o00O0o0 c26596o00O0o0;
        if (abstractC32479OooO0OO instanceof C26589o00O0O0o) {
            c26589o00O0O0o = (C26589o00O0O0o) abstractC32479OooO0OO;
            int i = c26589o00O0O0o.f91689OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26589o00O0O0o.f91689OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26589o00O0O0o = new C26589o00O0O0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26589o00O0O0o.f91687OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26589o00O0O0o.f91689OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26589o00O0O0o.f91688OooOo0o = this;
            c26589o00O0O0o.f91689OooOoO = 1;
            C26588o00O00oO c26588o00O00oO = this.f91720OooO00o;
            c26588o00O00oO.getClass();
            objOooO00o = c26588o00O00oO.OooO00o(str, new o00O00O(2, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26596o00O0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26596o00O0o0 = c26589o00O0O0o.f91688OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26596o00O0o0.f91721OooO0O0.toImage((ImageEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOOO(String str, Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo0o0O0 oo0o0o0;
        C26596o00O0o0 c26596o00O0o0;
        if (abstractC32479OooO0OO instanceof oo0o0O0) {
            oo0o0o0 = (oo0o0O0) abstractC32479OooO0OO;
            int i = oo0o0o0.f92178OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0o0o0.f92178OooOoO = i - Integer.MIN_VALUE;
            } else {
                oo0o0o0 = new oo0o0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oo0o0o0.f92176OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo0o0o0.f92178OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            oo0o0o0.f92177OooOo0o = this;
            oo0o0o0.f92178OooOoO = 1;
            C26588o00O00oO c26588o00O00oO = this.f91720OooO00o;
            c26588o00O00oO.getClass();
            objOooO00o = c26588o00O00oO.OooO00o(str, new o00O00OO(set, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26596o00O0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26596o00O0o0 = oo0o0o0.f92177OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26596o00O0o0.f91721OooO0O0.toImage((ImageEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOOO0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00O0OO0 o00o0oo02;
        C26596o00O0o0 c26596o00O0o0;
        if (abstractC32479OooO0OO instanceof o00O0OO0) {
            o00o0oo02 = (o00O0OO0) abstractC32479OooO0OO;
            int i = o00o0oo02.f91697OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o0oo02.f91697OooOoO = i - Integer.MIN_VALUE;
            } else {
                o00o0oo02 = new o00O0OO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o00o0oo02.f91695OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00o0oo02.f91697OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            o00o0oo02.f91696OooOo0o = this;
            o00o0oo02.f91697OooOoO = 1;
            C26588o00O00oO c26588o00O00oO = this.f91720OooO00o;
            c26588o00O00oO.getClass();
            objOooO00o = c26588o00O00oO.OooO00o(str2, new oOO00O(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26596o00O0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26596o00O0o0 = o00o0oo02.f91696OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26596o00O0o0.f91721OooO0O0.toImage((ImageEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOOOO(String str, String str2, RectF rectF, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00O0OO o00o0oo2;
        C26596o00O0o0 c26596o00O0o0;
        if (abstractC32479OooO0OO instanceof o00O0OO) {
            o00o0oo2 = (o00O0OO) abstractC32479OooO0OO;
            int i = o00o0oo2.f91693OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o0oo2.f91693OooOoO = i - Integer.MIN_VALUE;
            } else {
                o00o0oo2 = new o00O0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o00o0oo2.f91691OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00o0oo2.f91693OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            o00o0oo2.f91692OooOo0o = this;
            o00o0oo2.f91693OooOoO = 1;
            C26588o00O00oO c26588o00O00oO = this.f91720OooO00o;
            c26588o00O00oO.getClass();
            objOooO00o = c26588o00O00oO.OooO00o(str2, new C26586o00O00Oo(str, rectF, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26596o00O0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26596o00O0o0 = o00o0oo2.f91692OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26596o00O0o0.f91721OooO0O0.toImage((ImageEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOo(String str, Uri uri, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo0oOO0 oo0ooo0;
        if (abstractC32479OooO0OO instanceof oo0oOO0) {
            oo0ooo0 = (oo0oOO0) abstractC32479OooO0OO;
            int i = oo0ooo0.f92185OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0ooo0.f92185OooOoO = i - Integer.MIN_VALUE;
            } else {
                oo0ooo0 = new oo0oOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo0 = oo0ooo0.f92183OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo0ooo0.f92185OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo0);
            if (uri != null) {
                oo0ooo0.f92184OooOo0o = str;
                oo0ooo0.f92185OooOoO = 1;
                objOooOOo0 = OooOOo0(uri, oo0ooo0);
                if (objOooOOo0 == obj) {
                    return obj;
                }
            }
            return !C33595OooOOo.OooOOo0(str, ".png", false) ? str : str.concat(".png");
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = oo0ooo0.f92184OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo0);
        String strOooO0Oo = ((Boolean) objOooOOo0).booleanValue() ? C21111o0ooOoO.OooO0Oo(str, ".svg") : null;
        if (strOooO0Oo != null) {
            return strOooO0Oo;
        }
        if (!C33595OooOOo.OooOOo0(str, ".png", false)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo(String str, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26594o00O0Ooo c26594o00O0Ooo;
        if (abstractC32479OooO0OO instanceof C26594o00O0Ooo) {
            c26594o00O0Ooo = (C26594o00O0Ooo) abstractC32479OooO0OO;
            int i3 = c26594o00O0Ooo.f91715OooOoO0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c26594o00O0Ooo.f91715OooOoO0 = i3 - Integer.MIN_VALUE;
            } else {
                c26594o00O0Ooo = new C26594o00O0Ooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26594o00O0Ooo.f91714OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c26594o00O0Ooo.f91715OooOoO0;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26597o00O0o00 c26597o00O0o00 = new C26597o00O0o00(this, i, i2, str, null);
            c26594o00O0Ooo.f91715OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26597o00O0o00, c26594o00O0Ooo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    public final Object OooOOo0(Uri uri, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26591o00O0Oo(this, uri, null), abstractC32479OooO0OO);
    }

    public final Object OooOOoo(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f91721OooO0O0.toEntity((Image) it.next()));
        }
        C26588o00O00oO c26588o00O00oO = this.f91720OooO00o;
        c26588o00O00oO.getClass();
        Object objOooO00o = c26588o00O00oO.OooO00o(str, new C26587o00O00o(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}
