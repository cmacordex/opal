/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opalvoip;

public class OpalStatusUserInput {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OpalStatusUserInput(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OpalStatusUserInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OPALJNI.delete_OpalStatusUserInput(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_callToken(String value) {
    OPALJNI.OpalStatusUserInput_m_callToken_set(swigCPtr, this, value);
  }

  public String getM_callToken() {
    return OPALJNI.OpalStatusUserInput_m_callToken_get(swigCPtr, this);
  }

  public void setM_userInput(String value) {
    OPALJNI.OpalStatusUserInput_m_userInput_set(swigCPtr, this, value);
  }

  public String getM_userInput() {
    return OPALJNI.OpalStatusUserInput_m_userInput_get(swigCPtr, this);
  }

  public void setM_duration(long value) {
    OPALJNI.OpalStatusUserInput_m_duration_set(swigCPtr, this, value);
  }

  public long getM_duration() {
    return OPALJNI.OpalStatusUserInput_m_duration_get(swigCPtr, this);
  }

  public OpalStatusUserInput() {
    this(OPALJNI.new_OpalStatusUserInput(), true);
  }

}
