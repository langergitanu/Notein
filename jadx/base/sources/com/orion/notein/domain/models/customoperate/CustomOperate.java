package com.orion.notein.domain.models.customoperate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Metadata;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/notein/domain/models/customoperate/CustomOperate;", "", "<init>", "()V", "MAX_CUSTOM_LOCATION", "", "INSERT_IMAGE", "INSERT_PAGE", "SCREEN_SHOT", "INSERT_TEXT_BOX", "HAND_WRITE_MODE", "DATA_SYNC", "EXPORT_DOC", "CONFIG_PAGE", "PAGE_LAYER", "HYPERLINK", "INSERT_STICKER", "PAGE_PADDING", "TEXT_ANNO", "listOfOperateType", "", "getListOfOperateType", "()Ljava/util/List;", "ERROR_CODE_INVALID_TYPE", "", "OperateType", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CustomOperate {
    public static final int CONFIG_PAGE = 7;
    public static final int DATA_SYNC = 5;
    public static final String ERROR_CODE_INVALID_TYPE = "0001";
    public static final int EXPORT_DOC = 6;
    public static final int HAND_WRITE_MODE = 4;
    public static final int HYPERLINK = 9;
    public static final int INSERT_IMAGE = 0;
    public static final int INSERT_PAGE = 1;
    public static final int INSERT_STICKER = 10;
    public static final int INSERT_TEXT_BOX = 3;
    public static final int MAX_CUSTOM_LOCATION = 6;
    public static final int PAGE_LAYER = 8;
    public static final int PAGE_PADDING = 11;
    public static final int SCREEN_SHOT = 2;
    public static final int TEXT_ANNO = 12;
    public static final CustomOperate INSTANCE = new CustomOperate();
    private static final List<Integer> listOfOperateType = C34429OooOOo0.OooOO0o(0, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12);

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/domain/models/customoperate/CustomOperate$OperateType;", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public @interface OperateType {
    }

    private CustomOperate() {
    }

    public final List<Integer> getListOfOperateType() {
        return listOfOperateType;
    }
}
