/**
 * 
 */
package wcet.components.graphbuilder.instruction.exectime;

import wcet.framework.instruction.cache.LookupSwitchAnalysisInsn;

/**
 * @author Elena Axamitova
 * @version 0.1 15.03.2007
 */
public class LookupSwitchTimeAnalysisInsn extends LookupSwitchAnalysisInsn
		implements ITimeAnalysisInstruction {
	
	public LookupSwitchTimeAnalysisInsn(int opc, int size){
		super(opc, size);
	}
	/* (non-Javadoc)
	 * @see wcet.components.graphbuilder.instuctions.exectime.ITimeAnalysisInstruction#getCycles()
	 */
	public int getCycles() {
		return ITimeAnalysisInstruction.CYCLES_OF_LAST_METHOD;
	}

}