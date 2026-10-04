package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYC {
    private int zzWO;
    private double zzWP;
    private double zzWQ;
    private double zzWR;
    private double zzWS;
    private double zzWT;
    private double zzWU;
    private double zzWV;
    private double zzWW;
    private ArrayList<zzPV> zzWZ = new ArrayList<>();
    private zzQP zzWY = new zzQP();
    private zzQP zzWX = new zzQP();

    public final zzPV zzA(int i) {
        return this.zzWZ.get(i);
    }

    public final double zzB(int i) {
        return this.zzWX.get(i);
    }

    public final double zzC(int i) {
        return this.zzWY.get(i);
    }

    public final void zzI(double d) {
        this.zzWP = d;
    }

    public final void zzJ(double d) {
        this.zzWQ = d;
    }

    public final void zzK(double d) {
        this.zzWR = d;
    }

    public final void zzL(double d) {
        this.zzWS = d;
    }

    public final void zzM(double d) {
        this.zzWT = d;
    }

    public final void zzN(double d) {
        this.zzWU = d;
    }

    public final void zzO(double d) {
        this.zzWV = d;
    }

    public final void zzP(double d) {
        this.zzWW = d;
    }

    public final void zzW(zzPV zzpv) {
        zzZQG.zzZ(this.zzWZ, zzpv);
    }

    public final zzQP zzXQ() {
        return this.zzWX;
    }

    public final zzQP zzXR() {
        return this.zzWY;
    }

    public boolean zzXS() {
        return false;
    }

    public final int zzXT() {
        return this.zzWO;
    }

    public final double zzXU() {
        return this.zzWP;
    }

    public final double zzXV() {
        return this.zzWQ;
    }

    public final double zzXW() {
        return this.zzWR;
    }

    public final double zzXX() {
        return this.zzWS;
    }

    public final double zzXY() {
        return this.zzWT;
    }

    public final double zzXZ() {
        return this.zzWU;
    }

    public final double zzY0() {
        return this.zzWV;
    }

    public final double zzY1() {
        return this.zzWW;
    }

    public final void zzz(int i) {
        this.zzWO = i;
    }
}
