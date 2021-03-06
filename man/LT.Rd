% Generated by roxygen2: do not edit by hand
% Please edit documentation in R/LT.R
\name{LT}
\alias{LT}
\title{Lactate Thresholds}
\usage{
LT(WR, La, sig_rise = 1.5, plots = TRUE)
}
\arguments{
\item{WR}{a numeric vector of work rate values. Typically these would be the
work rates associated with stages in an incremental exercise test.}

\item{La}{a numeric vector of blood lactate values (mmol/L) associated with
the stages described in \code{WR}.}

\item{sig_rise}{numeric; a rise in blood [Lactate] that is deemed
significant. Default is 1.5 mmol/L.}

\item{plots}{should outputs be plotted?}
}
\value{
a data frame of model outputs, and optionally a matrix of plots.
}
\description{
Model lactate threshold markers from work rate (power) and blood lactate
values. Requires package "pspline".
}
\details{
This function is a slightly modified version of that written by
  Newell \emph{et al.} (2007) and published in the Journal of Sport Sciences
  (see references). The original source code, which also includes other
  functions for lactate analysis, can be found
  \href{http://www.nuigalway.ie/maths/jn/Lactate/html/lactate-r.html}{here}.
}
\examples{
# This data is included with Newell et al's source code.
WR <- c(50, 75, 100, 125, 150, 175, 200, 225, 250)
La <- c(2.8, 2.4, 2.4, 2.9, 3.1, 4.0, 5.8, 9.3, 12.2)
LT(WR, La, 1.5, TRUE)

}
\references{
John Newell , David Higgins , Niall Madden , James Cruickshank ,
  Jochen Einbeck , Kenny McMillan & Roddy McDonald (2007) Software for
  calculating blood lactate endurance markers, Journal of Sports Sciences,
  25:12, 1403-1409, \href{http://dx.doi.org/10.1080/02640410601128922}{DOI}.
}
\seealso{
Newell \emph{et al.}'s
  \href{https://orreco.shinyapps.io/lactate/}{Shiny app.}
}

