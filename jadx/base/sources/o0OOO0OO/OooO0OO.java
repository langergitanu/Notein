package o0OOO0OO;

import com.orion.notein.data.p602db.entity.cache.PageGridModificationRecordEntity;
import com.orion.notein.domain.mapper.PageGridModificationRecordMapper;
import com.orion.notein.domain.models.cache.PageGridModificationRecord;
import com.orion.notein.domain.models.page.PageGrid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o0OOo0Oo.InterfaceC27317Oooo00O;
import o0OoO0oo.C28956o00oOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0OO implements InterfaceC27317Oooo00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f93988OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PageGridModificationRecordMapper f93989OooO0O0;

    public OooO0OO(OooO00o oooO00o, PageGridModificationRecordMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f93988OooO00o = oooO00o;
        this.f93989OooO0O0 = mapper;
    }

    @Override // o0OOo0Oo.InterfaceC27317Oooo00O
    public final Object OooO00o(List list, C28956o00oOo00 c28956o00oOo00) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f93989OooO0O0.toEntity((PageGridModificationRecord) it.next()));
        }
        OooO00o oooO00o = this.f93988OooO00o;
        PageGridModificationRecordEntity[] pageGridModificationRecordEntityArr = (PageGridModificationRecordEntity[]) arrayList.toArray(new PageGridModificationRecordEntity[0]);
        Object objOooO0O0 = oooO00o.f93983OooO00o.OooO0O0((PageGridModificationRecordEntity[]) Arrays.copyOf(pageGridModificationRecordEntityArr, pageGridModificationRecordEntityArr.length), c28956o00oOo00);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27317Oooo00O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(PageGrid pageGrid, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0 oooO0O0;
        OooO0OO oooO0OO;
        if (abstractC32479OooO0OO instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) abstractC32479OooO0OO;
            int i = oooO0O0.f93986OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f93986OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oooO0O0.f93984OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f93986OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            String pageId = pageGrid.getPageId();
            int i3 = pageGrid.getIndex().x;
            int i4 = pageGrid.getIndex().y;
            oooO0O0.f93985OooOo0o = this;
            oooO0O0.f93986OooOoO = 1;
            objOooO00o = this.f93988OooO00o.f93983OooO00o.OooO00o(pageId, i3, i4, oooO0O0);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO0OO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0OO = oooO0O0.f93985OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        PageGridModificationRecordEntity pageGridModificationRecordEntity = (PageGridModificationRecordEntity) objOooO00o;
        if (pageGridModificationRecordEntity != null) {
            return oooO0OO.f93989OooO0O0.toModel(pageGridModificationRecordEntity);
        }
        return null;
    }
}
