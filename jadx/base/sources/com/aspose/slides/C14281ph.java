package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10397d4;
import com.aspose.slides.internal.p407st.C10534m3;

/* JADX INFO: renamed from: com.aspose.slides.ph */
/* JADX INFO: loaded from: classes3.dex */
class C14281ph {
    /* JADX INFO: renamed from: k4 */
    public static C10397d4 m69048k4(IBaseShapeLock iBaseShapeLock, C10534m3 c10534m3) {
        if (iBaseShapeLock == null) {
            return null;
        }
        C10397d4 c10397d4M5545k4 = ((BaseShapeLock) iBaseShapeLock).m376x1().m5545k4();
        if (c10397d4M5545k4 == null) {
            c10397d4M5545k4 = new C10397d4();
        }
        if (iBaseShapeLock.getNoLocks() && (c10397d4M5545k4.m51597ar() & 4294967295L) == 0) {
            return null;
        }
        c10534m3.m51263x1().m50930x1(c10397d4M5545k4);
        if (C7019kk.m27469x1(iBaseShapeLock, IGroupShapeLock.class)) {
            IGroupShapeLock iGroupShapeLock = (IGroupShapeLock) iBaseShapeLock;
            c10397d4M5545k4.m50639kk(true);
            c10397d4M5545k4.m50654up(iGroupShapeLock.getAspectRatioLocked());
            c10397d4M5545k4.m50636jd(true);
            c10397d4M5545k4.m50652u4(iGroupShapeLock.getGroupingLocked());
            c10397d4M5545k4.m50650to(true);
            c10397d4M5545k4.m50661yj(iGroupShapeLock.getPositionLocked());
            c10397d4M5545k4.m50657x1(true);
            c10397d4M5545k4.m50630fa(iGroupShapeLock.getRotationLocked());
            c10397d4M5545k4.m50626du(true);
            c10397d4M5545k4.m50641ks(iGroupShapeLock.getSelectLocked());
            c10397d4M5545k4.m50638k4(true);
            c10397d4M5545k4.m50624ck(iGroupShapeLock.getUngroupingLocked());
            return c10397d4M5545k4;
        }
        if (C7019kk.m27469x1(iBaseShapeLock, IAutoShapeLock.class)) {
            IAutoShapeLock iAutoShapeLock = (IAutoShapeLock) iBaseShapeLock;
            c10397d4M5545k4.m50622c5(true);
            c10397d4M5545k4.m50634ix(iAutoShapeLock.getAdjustHandlesLocked());
            c10397d4M5545k4.m50639kk(true);
            c10397d4M5545k4.m50654up(iAutoShapeLock.getAspectRatioLocked());
            c10397d4M5545k4.m50643m9(true);
            c10397d4M5545k4.m50659x6(iAutoShapeLock.getEditPointsLocked());
            c10397d4M5545k4.m50636jd(true);
            c10397d4M5545k4.m50652u4(iAutoShapeLock.getGroupingLocked());
            c10397d4M5545k4.m50650to(true);
            c10397d4M5545k4.m50661yj(iAutoShapeLock.getPositionLocked());
            c10397d4M5545k4.m50657x1(true);
            c10397d4M5545k4.m50630fa(iAutoShapeLock.getRotateLocked());
            c10397d4M5545k4.m50626du(true);
            c10397d4M5545k4.m50641ks(iAutoShapeLock.getSelectLocked());
            c10397d4M5545k4.m50628dy(true);
            c10397d4M5545k4.m50645ne(iAutoShapeLock.getTextLocked());
            return c10397d4M5545k4;
        }
        if (C7019kk.m27469x1(iBaseShapeLock, IPictureFrameLock.class)) {
            IPictureFrameLock iPictureFrameLock = (IPictureFrameLock) iBaseShapeLock;
            c10397d4M5545k4.m50622c5(true);
            c10397d4M5545k4.m50634ix(iPictureFrameLock.getAdjustHandlesLocked());
            c10397d4M5545k4.m50639kk(true);
            c10397d4M5545k4.m50654up(iPictureFrameLock.getAspectRatioLocked());
            c10397d4M5545k4.m50632h4(true);
            c10397d4M5545k4.m50648rv(iPictureFrameLock.getCropLocked());
            c10397d4M5545k4.m50643m9(true);
            c10397d4M5545k4.m50659x6(iPictureFrameLock.getEditPointsLocked());
            c10397d4M5545k4.m50636jd(true);
            c10397d4M5545k4.m50652u4(iPictureFrameLock.getGroupingLocked());
            c10397d4M5545k4.m50650to(true);
            c10397d4M5545k4.m50661yj(iPictureFrameLock.getPositionLocked());
            c10397d4M5545k4.m50657x1(true);
            c10397d4M5545k4.m50630fa(iPictureFrameLock.getRotationLocked());
            c10397d4M5545k4.m50626du(true);
            c10397d4M5545k4.m50641ks(iPictureFrameLock.getSelectLocked());
            return c10397d4M5545k4;
        }
        if (C7019kk.m27469x1(iBaseShapeLock, IGraphicalObjectLock.class)) {
            IGraphicalObjectLock iGraphicalObjectLock = (IGraphicalObjectLock) iBaseShapeLock;
            c10397d4M5545k4.m50639kk(true);
            c10397d4M5545k4.m50654up(iGraphicalObjectLock.getAspectRatioLocked());
            c10397d4M5545k4.m50636jd(true);
            c10397d4M5545k4.m50652u4(iGraphicalObjectLock.getGroupingLocked());
            c10397d4M5545k4.m50650to(true);
            c10397d4M5545k4.m50661yj(iGraphicalObjectLock.getPositionLocked());
            c10397d4M5545k4.m50626du(true);
            c10397d4M5545k4.m50641ks(iGraphicalObjectLock.getSelectLocked());
            return c10397d4M5545k4;
        }
        if (!C7019kk.m27469x1(iBaseShapeLock, IConnectorLock.class)) {
            throw new Exception();
        }
        IConnectorLock iConnectorLock = (IConnectorLock) iBaseShapeLock;
        c10397d4M5545k4.m50622c5(true);
        c10397d4M5545k4.m50634ix(iConnectorLock.getAdjustHandlesLocked());
        c10397d4M5545k4.m50639kk(true);
        c10397d4M5545k4.m50654up(iConnectorLock.getAspectRatioLocked());
        c10397d4M5545k4.m50643m9(true);
        c10397d4M5545k4.m50659x6(iConnectorLock.getEditPointsLocked());
        c10397d4M5545k4.m50636jd(true);
        c10397d4M5545k4.m50652u4(iConnectorLock.getGroupingLocked());
        c10397d4M5545k4.m50650to(true);
        c10397d4M5545k4.m50661yj(iConnectorLock.getPositionMove());
        c10397d4M5545k4.m50657x1(true);
        c10397d4M5545k4.m50630fa(iConnectorLock.getRotateLocked());
        c10397d4M5545k4.m50626du(true);
        c10397d4M5545k4.m50641ks(iConnectorLock.getSelectLocked());
        return c10397d4M5545k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69049k4(qah qahVar) {
        BaseShapeLock baseShapeLock = (BaseShapeLock) C7019kk.m27452k4((Object) ((IShape) qahVar.m69481du().m70148u4()).getShapeLock(), BaseShapeLock.class);
        C10534m3 c10534m3Mo50859du = qahVar.m69489kk().mo50859du();
        if (c10534m3Mo50859du == null || !c10534m3Mo50859du.m51263x1().m50931x1(127)) {
            return;
        }
        C10397d4 c10397d4 = (C10397d4) c10534m3Mo50859du.m51263x1().m50923k4(127);
        baseShapeLock.m376x1().m5546k4(c10397d4);
        baseShapeLock.m374k4((byte) 5, false);
        baseShapeLock.m374k4((byte) 1, c10397d4.m50633h4() ? c10397d4.m50646ne() : false);
        baseShapeLock.m374k4((byte) 4, c10397d4.m50627du() ? c10397d4.m50660x6() : false);
        baseShapeLock.m374k4((byte) 0, c10397d4.m50625ck() ? c10397d4.m50647qq() : false);
        IGroupShapeLock iGroupShapeLock = (IGroupShapeLock) C7019kk.m27452k4((Object) baseShapeLock, IGroupShapeLock.class);
        if (iGroupShapeLock != null) {
            iGroupShapeLock.setAspectRatioLocked(c10397d4.m50651to() ? c10397d4.m50649rv() : false);
            iGroupShapeLock.setRotationLocked(c10397d4.m50640kk() ? c10397d4.m50642ks() : false);
            iGroupShapeLock.setUngroupingLocked(c10397d4.m50658x1() ? c10397d4.m50631fa() : false);
            return;
        }
        IAutoShapeLock iAutoShapeLock = (IAutoShapeLock) C7019kk.m27452k4((Object) baseShapeLock, IAutoShapeLock.class);
        if (iAutoShapeLock != null) {
            iAutoShapeLock.setAdjustHandlesLocked(c10397d4.m50637jd() ? c10397d4.m50656wl() : false);
            iAutoShapeLock.setArrowheadsLocked(false);
            iAutoShapeLock.setAspectRatioLocked(c10397d4.m50651to() ? c10397d4.m50649rv() : false);
            iAutoShapeLock.setShapeTypeLocked(false);
            iAutoShapeLock.setEditPointsLocked(c10397d4.m50629dy() ? c10397d4.m50653u4() : false);
            iAutoShapeLock.setRotateLocked(c10397d4.m50640kk() ? c10397d4.m50642ks() : false);
            iAutoShapeLock.setTextLocked(c10397d4.m50623c5() ? c10397d4.m50655uz() : false);
            return;
        }
        IPictureFrameLock iPictureFrameLock = (IPictureFrameLock) C7019kk.m27452k4((Object) baseShapeLock, IPictureFrameLock.class);
        if (iPictureFrameLock != null) {
            iPictureFrameLock.setAdjustHandlesLocked(c10397d4.m50637jd() ? c10397d4.m50656wl() : false);
            iPictureFrameLock.setArrowheadsLocked(false);
            iPictureFrameLock.setAspectRatioLocked(c10397d4.m50651to() ? c10397d4.m50649rv() : false);
            iPictureFrameLock.setCropLocked(c10397d4.m50644m9() ? c10397d4.m50635ix() : false);
            iPictureFrameLock.setEditPointsLocked(c10397d4.m50629dy() ? c10397d4.m50653u4() : false);
            iPictureFrameLock.setRotationLocked(c10397d4.m50640kk() ? c10397d4.m50642ks() : false);
            iPictureFrameLock.setShapeTypeLocked(false);
            return;
        }
        IGraphicalObjectLock iGraphicalObjectLock = (IGraphicalObjectLock) C7019kk.m27452k4((Object) baseShapeLock, IGraphicalObjectLock.class);
        if (iGraphicalObjectLock != null) {
            iGraphicalObjectLock.setAspectRatioLocked(c10397d4.m50651to() ? c10397d4.m50649rv() : false);
            iGraphicalObjectLock.setDrilldownLocked(false);
            return;
        }
        IConnectorLock iConnectorLock = (IConnectorLock) C7019kk.m27452k4((Object) baseShapeLock, IConnectorLock.class);
        if (iConnectorLock != null) {
            iConnectorLock.setAdjustHandlesLocked(c10397d4.m50637jd() ? c10397d4.m50656wl() : false);
            iConnectorLock.setArrowheadsLocked(false);
            iConnectorLock.setAspectRatioLocked(c10397d4.m50651to() ? c10397d4.m50649rv() : false);
            iConnectorLock.setEditPointsLocked(c10397d4.m50629dy() ? c10397d4.m50653u4() : false);
            iConnectorLock.setRotateLocked(c10397d4.m50640kk() ? c10397d4.m50642ks() : false);
            iConnectorLock.setShapeTypeLocked(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69050k4(uz3 uz3Var) {
        IShape iShapeMo64936jd = uz3Var.mo64936jd();
        C10534m3 c10534m3M72004qq = uz3Var.m72004qq();
        if (C7019kk.m27469x1(iShapeMo64936jd, IGroupShape.class)) {
            m69048k4(((IGroupShape) iShapeMo64936jd).getShapeLock(), c10534m3M72004qq);
            return;
        }
        if (C7019kk.m27469x1(iShapeMo64936jd, IAutoShape.class)) {
            m69048k4(((IAutoShape) iShapeMo64936jd).getShapeLock(), c10534m3M72004qq);
            return;
        }
        if (C7019kk.m27469x1(iShapeMo64936jd, IPictureFrame.class)) {
            m69048k4(((IPictureFrame) iShapeMo64936jd).getShapeLock(), c10534m3M72004qq);
            return;
        }
        if (C7019kk.m27469x1(iShapeMo64936jd, IGraphicalObject.class)) {
            m69048k4(((IGraphicalObject) iShapeMo64936jd).getShapeLock(), c10534m3M72004qq);
            return;
        }
        if (C7019kk.m27469x1(iShapeMo64936jd, IConnector.class)) {
            m69048k4(((IConnector) iShapeMo64936jd).getShapeLock(), c10534m3M72004qq);
            return;
        }
        if (C7019kk.m27469x1(iShapeMo64936jd, ISmartArt.class)) {
            C10397d4 c10397d4M69048k4 = m69048k4(((IGraphicalObject) iShapeMo64936jd).getShapeLock(), c10534m3M72004qq);
            if (c10397d4M69048k4 == null) {
                c10397d4M69048k4 = new C10397d4();
                c10534m3M72004qq.m51263x1().m50930x1(c10397d4M69048k4);
            }
            c10397d4M69048k4.m50657x1(true);
            c10397d4M69048k4.m50639kk(true);
            c10397d4M69048k4.m50650to(true);
            c10397d4M69048k4.m50626du(true);
            c10397d4M69048k4.m50632h4(true);
            c10397d4M69048k4.m50643m9(true);
            c10397d4M69048k4.m50628dy(true);
            c10397d4M69048k4.m50622c5(true);
            c10397d4M69048k4.m50636jd(true);
        }
    }
}
