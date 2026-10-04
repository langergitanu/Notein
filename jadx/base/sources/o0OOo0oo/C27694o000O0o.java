package o0OOo0oo;

import com.aspose.slides.C22205OooOOo;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.o000O0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27694o000O0o implements InterfaceC27661OoooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27095OooOo0O f97577OooO00o;

    public C27694o000O0o(C27095OooOo0O c27095OooOo0O) {
        this.f97577OooO00o = c27095OooOo0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27661OoooOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27695o000OoO c27695o000OoO;
        if (abstractC32479OooO0OO instanceof C27695o000OoO) {
            c27695o000OoO = (C27695o000OoO) abstractC32479OooO0OO;
            int i = c27695o000OoO.f97600OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27695o000OoO.f97600OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27695o000OoO = new C27695o000OoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c27695o000OoO.f97598OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27695o000OoO.f97600OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            String id = cloudMetaLocal.getId();
            c27695o000OoO.f97599OooOo0o = cloudMetaLocal;
            c27695o000OoO.f97600OooOoO = 1;
            objOooOOO0 = this.f97577OooO00o.OooOOO0(id, c27695o000OoO);
            if (objOooOOO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cloudMetaLocal = c27695o000OoO.f97599OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
        }
        MyTemplate myTemplate = (MyTemplate) objOooOOO0;
        if (myTemplate == null) {
            return Boolean.FALSE;
        }
        boolean zIsLastModifiedOldThan = cloudMetaLocal.getContentTag().isLastModifiedOldThan(myTemplate.getLastModificationTime());
        if (zIsLastModifiedOldThan) {
            String name = myTemplate.getName();
            if (name == null) {
                PaperTheme paperTheme = myTemplate.getPaperTheme();
                name = paperTheme != null ? paperTheme.getName() : null;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TemplateDirtyDetector");
            String id2 = cloudMetaLocal.getId();
            long lastModificationTime = myTemplate.getLastModificationTime();
            long lastModified = cloudMetaLocal.getContentTag().getLastModified();
            String strOooO0O0 = C27666OooooOO.OooO0O0(name);
            StringBuilder sb = new StringBuilder("Template local modified: id=");
            sb.append(id2);
            sb.append(", lastMod=");
            sb.append(lastModificationTime);
            C22205OooOOo.OooO0OO(lastModified, ", contentTag.lastModified=", ", title=", sb);
            sb.append(strOooO0O0);
            c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
        }
        return Boolean.valueOf(zIsLastModifiedOldThan);
    }

    @Override // o0OOo0oo.InterfaceC27661OoooOoO
    public final Boolean OooO0O0(CloudMetaRemote cloudMetaRemote, CloudMetaLocal cloudMetaLocal) {
        return Boolean.valueOf(cloudMetaRemote.getDeleted() && cloudMetaRemote.getMetaVersion() > cloudMetaLocal.getMetaVersion());
    }

    @Override // o0OOo0oo.InterfaceC27661OoooOoO
    public final Boolean OooO0OO(CloudMetaRemote cloudMetaRemote, CloudMetaLocal cloudMetaLocal) {
        return Boolean.valueOf(!cloudMetaRemote.getDeleted() && cloudMetaRemote.getMetaVersion() > cloudMetaLocal.getMetaVersion());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0oo.InterfaceC27661OoooOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000O000 o000o0002;
        if (abstractC32479OooO0OO instanceof o000O000) {
            o000o0002 = (o000O000) abstractC32479OooO0OO;
            int i = o000o0002.f97571OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000o0002.f97571OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                o000o0002 = new o000O000(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = o000o0002.f97570OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000o0002.f97571OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            if (cloudMetaLocal.getDeleted()) {
                return Boolean.TRUE;
            }
            if (C27666OooooOO.OooO00o(cloudMetaLocal)) {
                return Boolean.FALSE;
            }
            String id = cloudMetaLocal.getId();
            o000o0002.f97571OooOoO0 = 1;
            objOooOOO0 = this.f97577OooO00o.OooOOO0(id, o000o0002);
            if (objOooOOO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOO0);
        }
        return Boolean.valueOf(objOooOOO0 == null);
    }
}
