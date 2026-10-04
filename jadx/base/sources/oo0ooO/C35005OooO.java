package oo0ooO;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalStagedContentEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0ooO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C35005OooO extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C35014OooOO0 f125708OooO00o;

    public C35005OooO(C35014OooOO0 c35014OooOO0) {
        this.f125708OooO00o = c35014OooOO0;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `cloud_metas_local` SET `id` = ?,`drive_id` = ?,`staged_content_tag` = ? WHERE `id` = ? AND `drive_id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        CloudMetaLocalStagedContentEntity cloudMetaLocalStagedContentEntity = (CloudMetaLocalStagedContentEntity) obj;
        if (cloudMetaLocalStagedContentEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, cloudMetaLocalStagedContentEntity.getId());
        }
        if (cloudMetaLocalStagedContentEntity.getDriveId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, cloudMetaLocalStagedContentEntity.getDriveId());
        }
        String strFromCloudContentTag = this.f125708OooO00o.f125727OooO0OO.fromCloudContentTag(cloudMetaLocalStagedContentEntity.getStagedContentTag());
        if (strFromCloudContentTag == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, strFromCloudContentTag);
        }
        if (cloudMetaLocalStagedContentEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, cloudMetaLocalStagedContentEntity.getId());
        }
        if (cloudMetaLocalStagedContentEntity.getDriveId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, cloudMetaLocalStagedContentEntity.getDriveId());
        }
    }
}
