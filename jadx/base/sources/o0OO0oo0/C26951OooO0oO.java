package o0OO0oo0;

import android.graphics.Bitmap;
import com.orion.notein.data.p602db.entity.cache.HandWritingTextCacheEntity;
import com.orion.notein.data.p602db.entity.cache.HandWritingTextCacheEntityWithoutElementsJson;
import com.orion.notein.data.p602db.entity.cache.UpdateTextCacheCreationTimeEntity;
import com.orion.notein.domain.mapper.HandWritingTextCacheMapper;
import com.orion.notein.domain.models.cache.HandWritingTextCache;
import com.orion.notein.domain.models.page.PageGrid;
import java.io.Serializable;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0Oo.InterfaceC27302OooOOo0;
import o0OOo0o.C27511o00o;
import o0OOo0o.C27561o00oOo;
import o0Oo00o0.C28031OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0oo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26951OooO0oO implements InterfaceC27302OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26947OooO0OO f93610OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26948OooO0Oo f93611OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HandWritingTextCacheMapper f93612OooO0OO;

    public C26951OooO0oO(C26945OooO00o c26945OooO00o, C26947OooO0OO c26947OooO0OO, C26948OooO0Oo c26948OooO0Oo, HandWritingTextCacheMapper mapper) {
        OooOOO0.OooO0oO(mapper, "mapper");
        this.f93610OooO00o = c26947OooO0OO;
        this.f93611OooO0O0 = c26948OooO0Oo;
        this.f93612OooO0OO = mapper;
    }

    @Override // o0OOo0Oo.InterfaceC27302OooOOo0
    public final Serializable OooO00o(Bitmap bitmap, boolean z, C27561o00oOo c27561o00oOo) {
        return this.f93610OooO00o.OooO0O0(bitmap, c27561o00oOo);
    }

    @Override // o0OOo0Oo.InterfaceC27302OooOOo0
    public final Object OooO0O0(HandWritingTextCache handWritingTextCache, C27511o00o c27511o00o) {
        Object objOooO0Oo = this.f93611OooO0O0.f93601OooO00o.OooO0Oo(new HandWritingTextCacheEntity[]{this.f93612OooO0OO.toEntity(handWritingTextCache)}, c27511o00o);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0Oo != enumC32485OooO00o) {
            objOooO0Oo = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0Oo == enumC32485OooO00o ? objOooO0Oo : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27302OooOOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(PageGrid pageGrid, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26949OooO0o c26949OooO0o;
        C26951OooO0oO c26951OooO0oO;
        if (abstractC32479OooO0OO instanceof C26949OooO0o) {
            c26949OooO0o = (C26949OooO0o) abstractC32479OooO0OO;
            int i = c26949OooO0o.f93604OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26949OooO0o.f93604OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26949OooO0o = new C26949OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c26949OooO0o.f93602OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26949OooO0o.f93604OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            String pageId = pageGrid.getPageId();
            int i3 = pageGrid.getIndex().x;
            int i4 = pageGrid.getIndex().y;
            c26949OooO0o.f93603OooOo0o = this;
            c26949OooO0o.f93604OooOoO = 1;
            objOooO0OO = this.f93611OooO0O0.f93601OooO00o.OooO0OO(pageId, i3, i4, c26949OooO0o);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26951OooO0oO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26951OooO0oO = c26949OooO0o.f93603OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
        }
        HandWritingTextCacheEntityWithoutElementsJson handWritingTextCacheEntityWithoutElementsJson = (HandWritingTextCacheEntityWithoutElementsJson) objOooO0OO;
        if (handWritingTextCacheEntityWithoutElementsJson != null) {
            return c26951OooO0oO.f93612OooO0OO.toModel(handWritingTextCacheEntityWithoutElementsJson);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27302OooOOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(PageGrid pageGrid, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26950OooO0o0 c26950OooO0o0;
        C26951OooO0oO c26951OooO0oO;
        if (abstractC32479OooO0OO instanceof C26950OooO0o0) {
            c26950OooO0o0 = (C26950OooO0o0) abstractC32479OooO0OO;
            int i = c26950OooO0o0.f93608OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26950OooO0o0.f93608OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26950OooO0o0 = new C26950OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26950OooO0o0.f93606OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26950OooO0o0.f93608OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            String pageId = pageGrid.getPageId();
            int i3 = pageGrid.getIndex().x;
            int i4 = pageGrid.getIndex().y;
            c26950OooO0o0.f93607OooOo0o = this;
            c26950OooO0o0.f93608OooOoO = 1;
            objOooO0O0 = this.f93611OooO0O0.f93601OooO00o.OooO0O0(pageId, i3, i4, c26950OooO0o0);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26951OooO0oO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26951OooO0oO = c26950OooO0o0.f93607OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        HandWritingTextCacheEntity handWritingTextCacheEntity = (HandWritingTextCacheEntity) objOooO0O0;
        if (handWritingTextCacheEntity != null) {
            return c26951OooO0oO.f93612OooO0OO.toModel(handWritingTextCacheEntity);
        }
        return null;
    }

    @Override // o0OOo0Oo.InterfaceC27302OooOOo0
    public final Object OooO0o0(PageGrid pageGrid, long j, C28031OooO00o c28031OooO00o) {
        String pageId = pageGrid.getPageId();
        int i = pageGrid.getIndex().x;
        int i2 = pageGrid.getIndex().y;
        Object objOooO00o = this.f93611OooO0O0.f93601OooO00o.OooO00o(new UpdateTextCacheCreationTimeEntity(pageId, i, i2, j), c28031OooO00o);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}
