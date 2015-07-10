/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scheduler;

import java.util.ArrayList;

/**
 *
 * @author hp pc
 */
public class ProcessDetail {
    private String processId;
    private int arrivalTime;
    private int serviceTime;
    private ArrayList<IOWaiting> ioWaitingList;
    private int status;

    public ProcessDetail() {
    }

    public ProcessDetail(String processId, int arrivalTime, int serviceTime, ArrayList<IOWaiting> ioInterrupts, int status) {
        this.processId = processId;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
        this.ioWaitingList = ioInterrupts;
        this.status = status;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public ArrayList<IOWaiting> getIoInterrupts() {
        return ioWaitingList;
    }

    public void setIoInterrupts(ArrayList<IOWaiting> ioInterrupts) {
        this.ioWaitingList = ioInterrupts;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
