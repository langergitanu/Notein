package o0OOOO00;

import android.graphics.Color;
import com.facebook.soloader.OooOo;
import com.orion.notein.data.p602db.entity.MyTemplateEntity;
import com.orion.notein.domain.mapper.MyTemplateMapper;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.ThemeCategory;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o0OOo0Oo.InterfaceC27316Oooo;
import o0OOo0o.C27560o00oOOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33770OooooO0;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34797o000o0o;

/* JADX INFO: renamed from: o0OOOO00.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27095OooOo0O implements InterfaceC27316Oooo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f94413OooO0o0 = C24340OooO0oo.OooO00o("has_download_right_or_has_not_download_wrong_meeting_theme");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f94414OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC34797o000o0o f94415OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final MyTemplateMapper f94416OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f94417OooO0Oo;

    public C27095OooOo0O(OooOO0O localDataSource, InterfaceC34797o000o0o myTemplateDao, MyTemplateMapper myTemplateMapper, o0000o0O.OooOO0<AbstractC24338OooO0o0> dataStore) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(localDataSource, "localDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(myTemplateDao, "myTemplateDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(myTemplateMapper, "myTemplateMapper");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f94414OooO00o = localDataSource;
        this.f94415OooO0O0 = myTemplateDao;
        this.f94416OooO0OO = myTemplateMapper;
        this.f94417OooO0Oo = dataStore;
    }

    public final List<Integer> OooO() {
        this.f94414OooO00o.getClass();
        return OooOO0O.f94366OooOo;
    }

    @Override // o0OOo0Oo.InterfaceC27316Oooo
    public final Object OooO00o(MyTemplate[] myTemplateArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        ArrayList arrayList = new ArrayList(myTemplateArr.length);
        for (MyTemplate myTemplate : myTemplateArr) {
            arrayList.add(this.f94416OooO0OO.toEntity(myTemplate));
        }
        MyTemplateEntity[] myTemplateEntityArr = (MyTemplateEntity[]) arrayList.toArray(new MyTemplateEntity[0]);
        Object objOooO0Oo = this.f94415OooO0O0.OooO0Oo((MyTemplateEntity[]) Arrays.copyOf(myTemplateEntityArr, myTemplateEntityArr.length), abstractC32479OooO0OO);
        return objOooO0Oo == EnumC32485OooO00o.f116726OooOo0o ? objOooO0Oo : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO00o = this.f94415OooO0O0.OooO00o(OooOo.OooO0oO(str), abstractC32479OooO0OO);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    public final C33770OooooO0 OooO0OO() {
        OooOO0O oooOO0O = this.f94414OooO00o;
        oooOO0O.getClass();
        return new C33770OooooO0(new OooO00o(oooOO0O, null));
    }

    public final OooOOO0 OooO0Oo() {
        return new OooOOO0(this.f94415OooO0O0.OooO0o0(), this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MyTemplate OooO0o() {
        ColorPaperTheme colorPaperTheme = new ColorPaperTheme(null, Color.parseColor("#b3f9f9f9"), 1, 0 == true ? 1 : 0);
        ThemeCategory themeCategory = OooOO0O.f94356OooOO0;
        return new MyTemplate("", new LambdaPaperTheme(colorPaperTheme, OooOO0O.f94361OooOOOO, PaperOrientation.VERTICAL, null, PaperStyle.INSTANCE.getNONE_PAPER(), null, 40, null), null, 0L, 0L, null, 56, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0o0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO oooOOO;
        C27095OooOo0O c27095OooOo0O;
        if (abstractC32479OooO0OO instanceof OooOOO) {
            oooOOO = (OooOOO) abstractC32479OooO0OO;
            int i = oooOOO.f94387OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f94387OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooOOO.f94385OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO.f94387OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooOOO.f94386OooOo0o = this;
            oooOOO.f94387OooOoO = 1;
            objOooO0O0 = this.f94415OooO0O0.OooO0O0(oooOOO);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27095OooOo0O = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27095OooOo0O = oooOOO.f94386OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        Iterable iterable = (Iterable) objOooO0O0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c27095OooOo0O.f94416OooO0OO.toMyTemplate((MyTemplateEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LambdaPaperTheme OooO0oO(PaperOrientation orientation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(orientation, "orientation");
        this.f94414OooO00o.getClass();
        PaperOrientation paperOrientation = PaperOrientation.VERTICAL;
        int i = 1;
        PaperTheme paperTheme = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (orientation == paperOrientation) {
            return new LambdaPaperTheme(new ColorPaperTheme(paperTheme, Color.parseColor("#FFFFFF"), i, objArr3 == true ? 1 : 0), OooOO0O.f94361OooOOOO, paperOrientation, null, PaperStyle.INSTANCE.getBLANK_PAPER(), null, 40, null);
        }
        return new LambdaPaperTheme(new ColorPaperTheme(objArr2 == true ? 1 : 0, Color.parseColor("#FFFFFF"), i, objArr == true ? 1 : 0), OooOO0O.f94361OooOOOO, PaperOrientation.HORIZONTAL, null, PaperStyle.INSTANCE.getBLANK_PAPER(), null, 40, null);
    }

    public final C27086OooO0o0 OooO0oo() {
        return new C27086OooO0o0(this.f94414OooO00o.f94372OooO00o.getData(), 0);
    }

    public final PaperTheme OooOO0(PaperOrientation orientation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(orientation, "orientation");
        OooOO0O oooOO0O = this.f94414OooO00o;
        oooOO0O.getClass();
        return orientation == PaperOrientation.VERTICAL ? oooOO0O.f94379OooO0oo.get(0) : oooOO0O.f94371OooO.get(0);
    }

    public final PaperTheme OooOO0O(PaperOrientation orientation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(orientation, "orientation");
        OooOO0O oooOO0O = this.f94414OooO00o;
        oooOO0O.getClass();
        return orientation == PaperOrientation.VERTICAL ? oooOO0O.f94376OooO0o.get(0) : oooOO0O.f94378OooO0oO.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOOO oooOOOO;
        C27095OooOo0O c27095OooOo0O;
        if (abstractC32479OooO0OO instanceof OooOOOO) {
            oooOOOO = (OooOOOO) abstractC32479OooO0OO;
            int i = oooOOOO.f94394OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f94394OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooOOOO.f94392OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOOO.f94394OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            oooOOOO.f94393OooOo0o = this;
            oooOOOO.f94394OooOoO = 1;
            objOooO0o = this.f94415OooO0O0.OooO0o(str, oooOOOO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27095OooOo0O = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27095OooOo0O = oooOOOO.f94393OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        MyTemplateEntity myTemplateEntity = (MyTemplateEntity) objOooO0o;
        if (myTemplateEntity != null) {
            return c27095OooOo0O.f94416OooO0OO.toMyTemplate(myTemplateEntity);
        }
        return null;
    }

    public final PaperTheme OooOOO(PaperOrientation orientation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(orientation, "orientation");
        OooOO0O oooOO0O = this.f94414OooO00o;
        oooOO0O.getClass();
        return orientation == PaperOrientation.VERTICAL ? oooOO0O.f94373OooO0O0.get(0) : oooOO0O.f94374OooO0OO.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27090OooOOOo c27090OooOOOo;
        C27095OooOo0O c27095OooOo0O;
        if (abstractC32479OooO0OO instanceof C27090OooOOOo) {
            c27090OooOOOo = (C27090OooOOOo) abstractC32479OooO0OO;
            int i = c27090OooOOOo.f94398OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27090OooOOOo.f94398OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27090OooOOOo = new C27090OooOOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27090OooOOOo.f94396OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27090OooOOOo.f94398OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27090OooOOOo.f94397OooOo0o = this;
            c27090OooOOOo.f94398OooOoO = 1;
            objOooO0o = this.f94415OooO0O0.OooO0o(str, c27090OooOOOo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27095OooOo0O = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27095OooOo0O = c27090OooOOOo.f94397OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        MyTemplateEntity myTemplateEntity = (MyTemplateEntity) objOooO0o;
        if (myTemplateEntity != null) {
            return c27095OooOo0O.f94416OooO0OO.toMyTemplate(myTemplateEntity);
        }
        return null;
    }

    public final C27088OooO0oo OooOOOO() {
        return new C27088OooO0oo(this.f94414OooO00o.f94372OooO00o.getData());
    }

    public final Object OooOOOo(ArrayList arrayList, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27093OooOOoo(this, arrayList, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooOOo(MyTemplate myTemplate, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO0OO = this.f94415OooO0O0.OooO0OO(new MyTemplateEntity[]{this.f94416OooO0OO.toEntity(MyTemplate.copy$default(myTemplate, null, null, null, 0L, System.currentTimeMillis(), null, 47, null))}, abstractC32479OooO0OO);
        return objOooO0OO == EnumC32485OooO00o.f116726OooOo0o ? objOooO0OO : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooOOo0(C27560o00oOOoO c27560o00oOOoO) {
        Object objOooO00o = C24332OooO.OooO00o(this.f94417OooO0Oo, new C27094OooOo0(2, null), c27560o00oOOoO);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}
