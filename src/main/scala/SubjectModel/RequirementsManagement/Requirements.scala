package SubjectModel.RequirementsManagement



/** ==class Requirements==
* @author Dynamic
* Класс, который инкапсулирует основные параметры для каждого вида требования
*   @param requirementDescription
  * @param requirementId
  * @param timeOfClaim
  *
**/
case class Requirements (

                          var requirementId: Long,
                          var requirementDescription: String,
                          var timeOfClaim: String

                        )




