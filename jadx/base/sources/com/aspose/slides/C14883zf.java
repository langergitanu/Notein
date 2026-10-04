package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C7850hh;
import com.aspose.slides.internal.p332p7.C7964iv;
import com.aspose.slides.internal.p332p7.C8505pa;
import com.aspose.slides.internal.p332p7.C9034vf;
import com.aspose.slides.internal.p332p7.C9096w8;

/* JADX INFO: renamed from: com.aspose.slides.zf */
/* JADX INFO: loaded from: classes3.dex */
class C14883zf {
    /* JADX INFO: renamed from: k4 */
    public static void m74498k4(AutoShapeLock autoShapeLock, AbstractC4685kk<C8505pa> abstractC4685kk) {
        if (autoShapeLock == null) {
            return;
        }
        AbstractC7414ck abstractC7414ckM70023k4 = autoShapeLock.m373k4().m70023k4();
        if (autoShapeLock.getNoLocks() && abstractC7414ckM70023k4 == null) {
            return;
        }
        C8505pa c8505paInvoke = abstractC4685kk.invoke();
        if (!autoShapeLock.getNoLocks()) {
            c8505paInvoke.m38747dy(autoShapeLock.getAdjustHandlesLocked());
            c8505paInvoke.m38741c5(autoShapeLock.getArrowheadsLocked());
            c8505paInvoke.m38761to(autoShapeLock.getAspectRatioLocked());
            c8505paInvoke.m38752jd(autoShapeLock.getShapeTypeLocked());
            c8505paInvoke.m38759m9(autoShapeLock.getEditPointsLocked());
            c8505paInvoke.m38755k4(autoShapeLock.getGroupingLocked());
            c8505paInvoke.m38745du(autoShapeLock.getPositionLocked());
            c8505paInvoke.m38750h4(autoShapeLock.getSizeLocked());
            c8505paInvoke.m38757kk(autoShapeLock.getRotateLocked());
            c8505paInvoke.m38763x1(autoShapeLock.getSelectLocked());
            c8505paInvoke.m38743ck(autoShapeLock.getTextLocked());
        }
        c8505paInvoke.m38754k4(abstractC7414ckM70023k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74499k4(ConnectorLock connectorLock, AbstractC4685kk<C9034vf> abstractC4685kk) {
        if (connectorLock == null) {
            return;
        }
        AbstractC7414ck abstractC7414ckM70023k4 = connectorLock.m373k4().m70023k4();
        if (connectorLock.getNoLocks() && abstractC7414ckM70023k4 == null) {
            return;
        }
        C9034vf c9034vfInvoke = abstractC4685kk.invoke();
        if (!connectorLock.getNoLocks()) {
            c9034vfInvoke.m43045dy(connectorLock.getAdjustHandlesLocked());
            c9034vfInvoke.m43040c5(connectorLock.getArrowheadsLocked());
            c9034vfInvoke.m43058to(connectorLock.getAspectRatioLocked());
            c9034vfInvoke.m43056m9(connectorLock.getEditPointsLocked());
            c9034vfInvoke.m43052k4(connectorLock.getGroupingLocked());
            c9034vfInvoke.m43043du(connectorLock.getPositionMove());
            c9034vfInvoke.m43054kk(connectorLock.getRotateLocked());
            c9034vfInvoke.m43060x1(connectorLock.getSelectLocked());
            c9034vfInvoke.m43049jd(connectorLock.getShapeTypeLocked());
            c9034vfInvoke.m43047h4(connectorLock.getSizeLocked());
        }
        c9034vfInvoke.m43051k4(abstractC7414ckM70023k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74500k4(GraphicalObjectLock graphicalObjectLock, AbstractC4685kk<C7964iv> abstractC4685kk) {
        if (graphicalObjectLock == null) {
            return;
        }
        AbstractC7414ck abstractC7414ckM70023k4 = graphicalObjectLock.m373k4().m70023k4();
        if (graphicalObjectLock.getNoLocks() && abstractC7414ckM70023k4 == null) {
            return;
        }
        C7964iv c7964ivInvoke = abstractC4685kk.invoke();
        if (!graphicalObjectLock.getNoLocks()) {
            c7964ivInvoke.m34492to(graphicalObjectLock.getAspectRatioLocked());
            c7964ivInvoke.m34494x1(graphicalObjectLock.getDrilldownLocked());
            c7964ivInvoke.m34487k4(graphicalObjectLock.getGroupingLocked());
            c7964ivInvoke.m34482du(graphicalObjectLock.getPositionLocked());
            c7964ivInvoke.m34489kk(graphicalObjectLock.getSelectLocked());
            c7964ivInvoke.m34484h4(graphicalObjectLock.getSizeLocked());
        }
        c7964ivInvoke.m34486k4(abstractC7414ckM70023k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74501k4(GroupShapeLock groupShapeLock, AbstractC4685kk<C9096w8> abstractC4685kk) {
        if (groupShapeLock == null) {
            return;
        }
        AbstractC7414ck abstractC7414ckM70023k4 = groupShapeLock.m373k4().m70023k4();
        if (groupShapeLock.getNoLocks() && abstractC7414ckM70023k4 == null) {
            return;
        }
        C9096w8 c9096w8Invoke = abstractC4685kk.invoke();
        if (!groupShapeLock.getNoLocks()) {
            c9096w8Invoke.m43558du(groupShapeLock.getAspectRatioLocked());
            c9096w8Invoke.m43564k4(groupShapeLock.getGroupingLocked());
            c9096w8Invoke.m43561h4(groupShapeLock.getPositionLocked());
            c9096w8Invoke.m43570to(groupShapeLock.getRotationLocked());
            c9096w8Invoke.m43566kk(groupShapeLock.getSelectLocked());
            c9096w8Invoke.m43568m9(groupShapeLock.getSizeLocked());
            c9096w8Invoke.m43572x1(groupShapeLock.getUngroupingLocked());
        }
        c9096w8Invoke.m43563k4(abstractC7414ckM70023k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74502k4(IAutoShapeLock iAutoShapeLock, C8505pa c8505pa) {
        if (c8505pa == null) {
            return;
        }
        m74503k4(iAutoShapeLock, c8505pa.m38749fa());
        iAutoShapeLock.setAdjustHandlesLocked(c8505pa.m38748dy());
        iAutoShapeLock.setArrowheadsLocked(c8505pa.m38742c5());
        iAutoShapeLock.setAspectRatioLocked(c8505pa.m38762to());
        iAutoShapeLock.setShapeTypeLocked(c8505pa.m38753jd());
        iAutoShapeLock.setEditPointsLocked(c8505pa.m38760m9());
        iAutoShapeLock.setGroupingLocked(c8505pa.m38756k4());
        iAutoShapeLock.setPositionLocked(c8505pa.m38746du());
        iAutoShapeLock.setSizeLocked(c8505pa.m38751h4());
        iAutoShapeLock.setRotateLocked(c8505pa.m38758kk());
        iAutoShapeLock.setSelectLocked(c8505pa.m38764x1());
        iAutoShapeLock.setTextLocked(c8505pa.m38744ck());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74503k4(IBaseShapeLock iBaseShapeLock, AbstractC7414ck abstractC7414ck) {
        ((BaseShapeLock) iBaseShapeLock).m373k4().m70024k4(abstractC7414ck);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74504k4(IConnectorLock iConnectorLock, C9034vf c9034vf) {
        if (c9034vf == null) {
            return;
        }
        m74503k4(iConnectorLock, c9034vf.m43042ck());
        iConnectorLock.setAdjustHandlesLocked(c9034vf.m43046dy());
        iConnectorLock.setArrowheadsLocked(c9034vf.m43041c5());
        iConnectorLock.setAspectRatioLocked(c9034vf.m43059to());
        iConnectorLock.setEditPointsLocked(c9034vf.m43057m9());
        iConnectorLock.setGroupingLocked(c9034vf.m43053k4());
        iConnectorLock.setPositionMove(c9034vf.m43044du());
        iConnectorLock.setRotateLocked(c9034vf.m43055kk());
        iConnectorLock.setSelectLocked(c9034vf.m43061x1());
        iConnectorLock.setShapeTypeLocked(c9034vf.m43050jd());
        iConnectorLock.setSizeLocked(c9034vf.m43048h4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74505k4(IGraphicalObjectLock iGraphicalObjectLock, C7964iv c7964iv) {
        if (c7964iv == null) {
            return;
        }
        m74503k4(iGraphicalObjectLock, c7964iv.m34491m9());
        iGraphicalObjectLock.setAspectRatioLocked(c7964iv.m34493to());
        iGraphicalObjectLock.setDrilldownLocked(c7964iv.m34495x1());
        iGraphicalObjectLock.setGroupingLocked(c7964iv.m34488k4());
        iGraphicalObjectLock.setPositionLocked(c7964iv.m34483du());
        iGraphicalObjectLock.setSelectLocked(c7964iv.m34490kk());
        iGraphicalObjectLock.setSizeLocked(c7964iv.m34485h4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74506k4(IGroupShapeLock iGroupShapeLock, C9096w8 c9096w8) {
        if (c9096w8 == null) {
            return;
        }
        m74503k4(iGroupShapeLock, c9096w8.m43560dy());
        iGroupShapeLock.setAspectRatioLocked(c9096w8.m43559du());
        iGroupShapeLock.setGroupingLocked(c9096w8.m43565k4());
        iGroupShapeLock.setPositionLocked(c9096w8.m43562h4());
        iGroupShapeLock.setRotationLocked(c9096w8.m43571to());
        iGroupShapeLock.setSelectLocked(c9096w8.m43567kk());
        iGroupShapeLock.setSizeLocked(c9096w8.m43569m9());
        iGroupShapeLock.setUngroupingLocked(c9096w8.m43573x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74507k4(IPictureFrameLock iPictureFrameLock, C7850hh c7850hh) {
        if (c7850hh == null) {
            return;
        }
        m74503k4(iPictureFrameLock, c7850hh.m33368fa());
        iPictureFrameLock.setAdjustHandlesLocked(c7850hh.m33367dy());
        iPictureFrameLock.setArrowheadsLocked(c7850hh.m33361c5());
        iPictureFrameLock.setAspectRatioLocked(c7850hh.m33381to());
        iPictureFrameLock.setCropLocked(c7850hh.m33363ck());
        iPictureFrameLock.setEditPointsLocked(c7850hh.m33379m9());
        iPictureFrameLock.setGroupingLocked(c7850hh.m33375k4());
        iPictureFrameLock.setPositionLocked(c7850hh.m33365du());
        iPictureFrameLock.setRotationLocked(c7850hh.m33377kk());
        iPictureFrameLock.setSelectLocked(c7850hh.m33383x1());
        iPictureFrameLock.setShapeTypeLocked(c7850hh.m33372jd());
        iPictureFrameLock.setSizeLocked(c7850hh.m33370h4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74508k4(PictureFrameLock pictureFrameLock, AbstractC4685kk<C7850hh> abstractC4685kk) {
        if (pictureFrameLock == null) {
            return;
        }
        AbstractC7414ck abstractC7414ckM70023k4 = pictureFrameLock.m373k4().m70023k4();
        if (pictureFrameLock.getNoLocks() && abstractC7414ckM70023k4 == null) {
            return;
        }
        C7850hh c7850hhInvoke = abstractC4685kk.invoke();
        if (!pictureFrameLock.getNoLocks()) {
            c7850hhInvoke.m33366dy(pictureFrameLock.getAdjustHandlesLocked());
            c7850hhInvoke.m33360c5(pictureFrameLock.getArrowheadsLocked());
            c7850hhInvoke.m33380to(pictureFrameLock.getAspectRatioLocked());
            c7850hhInvoke.m33362ck(pictureFrameLock.getCropLocked());
            c7850hhInvoke.m33378m9(pictureFrameLock.getEditPointsLocked());
            c7850hhInvoke.m33374k4(pictureFrameLock.getGroupingLocked());
            c7850hhInvoke.m33364du(pictureFrameLock.getPositionLocked());
            c7850hhInvoke.m33376kk(pictureFrameLock.getRotationLocked());
            c7850hhInvoke.m33382x1(pictureFrameLock.getSelectLocked());
            c7850hhInvoke.m33371jd(pictureFrameLock.getShapeTypeLocked());
            c7850hhInvoke.m33369h4(pictureFrameLock.getSizeLocked());
        }
        c7850hhInvoke.m33373k4(abstractC7414ckM70023k4);
    }
}
